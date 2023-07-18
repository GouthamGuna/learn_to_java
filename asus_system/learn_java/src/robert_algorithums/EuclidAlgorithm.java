package robert_algorithums;

public class EuclidAlgorithm {

    public static int gcd(int u, int v){
        int t;
        if (u > 0) {
            do {
                if (u < v) {
                    t = u;
                    u = v;
                    v = t;
                    u = u - v;
                }
                break;
            } while (u > 0);
        }
        return v;
    }

    public static int mainStream(int x, int y){

        /*while (cin >> x && cin >> y){
            if(x > 0 && y > 0)
                count << x << ' ' << y << ' ' << gcd(x, y) << '\n';
        }*/



       return gcd(x, y);
    }

    public static void main(String[] args) {
        System.out.println("output : "+mainStream(20, 10));
    }
}
