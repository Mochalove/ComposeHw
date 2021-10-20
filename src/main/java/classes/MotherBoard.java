package classes;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }

    public void loadProgam(String programName){
        System.out.println(programName);
    }
}
