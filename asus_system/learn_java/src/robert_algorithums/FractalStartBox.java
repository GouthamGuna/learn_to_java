package robert_algorithums;

public class FractalStartBox {
    public static void main(String[] args) {
        star(0,0,1);
    }

    static void star(int x, int y, int r){

        if(r>0){
            star(x-r, y+r, r/2);
            star(x+r, y+r, r/2);
            star(x-r, y-r, r/2);
            star(x+r, y-r, r/2);

            System.out.println("x = " + x + ", y = " + y + ", r = " + r);
        }
    }
}
