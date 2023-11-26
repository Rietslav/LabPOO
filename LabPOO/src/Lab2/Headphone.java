package Lab2;

public class Headphone {
    private String name;
    private String model;
    private String color;
    private int frequency;

    public Headphone (String name, String model, String color, int frequency) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.frequency = frequency;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getFrequency() {
        return this.frequency;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        String message = "Headphone characteristics:\n";
        return String.format("%sName: %s\nModel: %s\nColor: %s\nFrequency: %d\n", message, this.name, this.model, this.color, this.frequency);
    }
}
