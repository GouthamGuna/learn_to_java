package abstraction_demo;

public class ManiMethod {
    public static void main(String[] args) {

        ASUS asus=new ASUS();
        HP hp=new HP();
        MAC mac=new MAC();

        LapTop[] getLapDetails={asus, hp, mac};

        for(LapTop XYZ : getLapDetails){
            System.out.println(XYZ.getClassName());
        }
    }
}
