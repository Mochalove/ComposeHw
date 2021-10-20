package classes;

public class Case {
    private String manufractuear;
    private String powerSupply;
    private String model;
    private Dimension dimension;
    public Case(String manufractuear, String powerSupply, String model, Dimension dimension) {
        this.manufractuear = manufractuear;
        this.powerSupply = powerSupply;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Case{" +
                "manufractuear='" + manufractuear + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", model='" + model + '\'' +
                ", dimension=" + dimension +
                '}';
    }

    public void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }
}

