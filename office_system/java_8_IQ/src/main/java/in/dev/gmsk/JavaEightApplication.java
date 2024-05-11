package in.dev.gmsk;

        import com.github.axet.vget.VGet;
        import com.google.common.cache.Cache;
        import com.google.common.cache.CacheBuilder;
        import com.google.common.cache.CacheLoader;
        import com.google.common.cache.LoadingCache;
        import in.dev.gmsk.abstraction.MyClass;
        import in.dev.gmsk.abstraction.MyInterface;
        import in.dev.gmsk.model.Employee;
        import in.dev.gmsk.service.Calculator;
        import io.github.gaeqs.javayoutubedownloader.JavaYoutubeDownloader;
        import io.github.gaeqs.javayoutubedownloader.decoder.MultipleDecoderMethod;
        import io.github.gaeqs.javayoutubedownloader.stream.StreamOption;
        import io.github.gaeqs.javayoutubedownloader.stream.YoutubeVideo;
        import io.github.gaeqs.javayoutubedownloader.stream.download.StreamDownloader;
        import jakarta.json.bind.Jsonb;
        import jakarta.json.bind.JsonbBuilder;
        import lombok.val;

        import java.io.File;
        import java.net.URL;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.Comparator;
        import java.util.concurrent.ExecutionException;

public class JavaEightApplication {

    public static void main(String[] args) throws ExecutionException {
        System.out.println("Hello Lunar *)");

        MyInterface object = new MyClass();
        object.methodA();

        System.out.println("methodB() return int = " + object.methodB());

        String output = object.methodC(10.50, 20.50);
        System.out.println("output = " + output);

        System.out.println(object.methodD());

        JavaEightApplication.moreCache();
        JavaEightApplication.GuavaCacheTest();

        // downloadTest("https://youtu.be/2ZLl8GAk1X4?si=DC_4uZ3YztrLw9lE", new File("C:\\Users\\User\\Downloads\\output.mp4"));

        learnWithoutServletContext();

        deleteDirectory(new File("E:\\GMSK_WorkSpace\\notepad_WS\\test"));

        try {
            String url = "https://youtu.be/2ZLl8GAk1X4?si=DC_4uZ3YztrLw9lE";
            String path = "C:\\Users\\User\\Downloads\\output.mp4";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

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

    public static void moreCache() throws ExecutionException {

        LoadingCache<String, Integer> cache =
                CacheBuilder.newBuilder().build(new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String key) {
                        return key.length();
                    }
                });
        cache.get("gmsk");
        cache.put("gs", 4);
        System.err.println(cache.get("gmsk"));
        System.err.println(cache.get("gowthamsankar"));
    }

    public static void GuavaCacheTest() {

        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(3).recordStats().build();

        cache.put("1", "v1");
        cache.put("2", "v2");
        cache.put("3", "v3");
        cache.put("4", "v4");

        cache.getIfPresent("1");
        cache.getIfPresent("2");
        cache.getIfPresent("3");
        cache.getIfPresent("4");
        cache.getIfPresent("5");
        cache.getIfPresent("6");

        System.err.println("cache.stats() : " + cache.stats());
    }

    public static boolean testStringContains(String dbInput) {
        boolean status = false;
        String default_value = "https://raw.githubusercontent.com/CERPSoftwareSolutions/webimage/main/admin.jpg";

        // while (true) {
        if (null != dbInput && !dbInput.isEmpty() && !dbInput.contentEquals(default_value)) {

            System.out.println("Inner IF Loop : ");

            File file = new File(dbInput);

            if (!file.exists()) {
                System.out.println("set default_value " + default_value);
            } else {
                System.out.println("dbInput : " + dbInput);
                status = true;
            }

        } else {
            System.out.println("Outer ELSE Loop : ");
        }

        System.out.println("getName()");
        System.out.println("getUserInfo()");
        //  }
        return status;
    }

    static void countStringObject() {

        String s1 = " Hello ";
        s1 += " Lunar! ";
        s1.trim();

        System.out.println("s1 = " + s1);

        StringBuffer stringBuffer = new StringBuffer(" Hello ");
        stringBuffer.append(" Lunar! ");

        System.out.println("stringBuffer = " + stringBuffer.toString().trim());

        String empFirstName = " Gowtham ";

        Employee employee = new Employee();
        employee.setName(new StringBuilder(empFirstName).toString().toUpperCase().trim());

        System.out.println("employee = " + employee.toString());
    }

    static String testingJsonAPI(Employee employee) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(employee);
    }

    static int functionInterfaceAdd(int x, int y) {

        Calculator calculator = Integer::sum;

        return calculator.calculate(x, y);
    }

    static int functionInterfaceSub(int x, int y) {

        Calculator calculator = (a, b) -> a - b;

        return calculator.calculate(x, y);
    }

    static int functionInterfaceMultiple(int x, int y) {

        Calculator calculator = (a, b) -> a * b;

        return calculator.calculate(x, y);
    }

    static int functionInterfaceDived(int x, int y) {

        Calculator calculator = (a, b) -> a / b;

        return calculator.calculate(x, y);
    }

    static int functionInterfaceMod(int x, int y) {

        Calculator calculator = (a, b) -> a % b;

        return calculator.calculate(x, y);
    }

    public static boolean downloadTest(String url, File folder) {
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

    public static void learnWithoutServletContext() {

        File file = new File("E:\\GMSK_WorkSpace\\notepad_WS\\test");

        if (!file.exists()) file.mkdirs();

        String realPath = file.getAbsolutePath();

        System.out.println("realPath = " + realPath);

        Path path = Paths.get("E:\\GMSK_WorkSpace\\notepad_WS\\test");
        String realPathURI = path.toUri().getPath();

        System.out.println("realPathURI = " + realPathURI);

    }

    private static void deleteDirectory(File dir) {
        for (File f : dir.listFiles()) {
            if (f.isFile()) {
                f.delete();
            } else if (f.isDirectory()) {
                deleteDirectory(f);
                f.delete();
            }
        }
    }
}
