package Lab2;

public class Keyboard {
    private String name;
    private String model;
    private String typeKey;
    private int size;

    public Keyboard (String name, String model, String typeKey, int size) {
        this.name = name;
        this.model = model;
        this.typeKey = typeKey;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public int getSize() {
        return size;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String message = "Keyboard characteristics:\n";
        return String.format("%sName: %s\nModel: %s\nType Key: %s\nSize: %d\n", message, this.name, this.model, this.typeKey, this.size);
    }
}
