package classes;

public class Main {
    public static void main(String[] args) {
        Dimension dz = new Dimension(7,8,10);
        Resolution rz = new Resolution(8, 2);
        Monitor mz = new Monitor(rz,"yolo", "toothache");
        MotherBoard mzz = new MotherBoard("Tl3", "honeywell", 7, "toshiba" );
        Case cs = new Case("happy", "nothappy", "Tinnie",dz);
        PC pz = new PC(cs, mz, mzz);
        pz.description();
        pz.powerUp();

    }
}
