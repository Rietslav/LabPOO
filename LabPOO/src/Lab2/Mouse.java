package Lab2;

public class Mouse {
    private String name;
    private String model;
    private int sensivity;

    public Mouse (String name, String model, int sensivity) {
        this.name = name;
        this.model = model;
        this.sensivity = sensivity;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getFrequency() {
        return sensivity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(int sensivity) {
        this.sensivity = sensivity;
    }

    @Override
    public String toString() {
        String message = "Mouse characteristics:\n";
        return String.format("%sName: %s\nModel: %s\nFrequency: %d\n", message, this.name, this.model, this.sensivity);
    }
}
