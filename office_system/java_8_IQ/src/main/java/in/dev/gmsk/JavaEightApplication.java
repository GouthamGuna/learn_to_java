package in.dev.gmsk;

import in.dev.gmsk.abstraction.MyClass;
import in.dev.gmsk.abstraction.MyInterface;
import io.github.gaeqs.javayoutubedownloader.JavaYoutubeDownloader;
import io.github.gaeqs.javayoutubedownloader.decoder.MultipleDecoderMethod;
import io.github.gaeqs.javayoutubedownloader.stream.StreamOption;
import io.github.gaeqs.javayoutubedownloader.stream.YoutubeVideo;
import io.github.gaeqs.javayoutubedownloader.stream.download.StreamDownloader;

import java.io.File;
import java.util.Comparator;

public class JavaEightApplication {

    public static void main(String[] args) {
        System.out.println("Hello Lunar *)");

        MyInterface object = new MyClass();
        object.methodA();

        System.out.println("methodB() return int = "+object.methodB());

        String output = object.methodC(10.50, 20.50);
        System.out.println("output = " + output);

        System.out.println(object.methodD());
    }

    public static boolean download(String url, File folder) {
        //Extracts and decodes all streams.
        YoutubeVideo video = JavaYoutubeDownloader.decodeOrNull(url, MultipleDecoderMethod.AND, "html", "embedded");
        //Gets the option with the greatest quality that has video and audio.
        StreamOption option = video.getStreamOptions().stream()
                .filter(target -> target.getType().hasVideo() && target.getType().hasAudio())
                .min(Comparator.comparingInt(o -> o.getType().getVideoQuality().ordinal())).orElse(null);
        //If there is no option, returns false.
        if (option == null) return false;
        //Prints the option type.
        System.out.println(option.getType());
        //Creates the file. folder/title.extension
        File file = new File(folder, video.getTitle() + "." + option.getType().getContainer().toString().toLowerCase());
        //Creates the downloader.
        StreamDownloader downloader = new StreamDownloader(option, file, null);
        //Runs the downloader.
        new Thread(downloader).start();
        return true;
    }
}
