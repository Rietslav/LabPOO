package Lab2;

public class Microphone {
    private String name;
    private String model;
    private int frequency;

    public Microphone (String name, String model, int frequency) {
        this.name = name;
        this.model = model;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getFrequency() {
        return frequency;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        String message = "Microphone characteristics:\n";
        return String.format("%sName: %s\nModel: %s\nFrequency: %d\n", message, this.name, this.model, this.frequency);
    }
}

