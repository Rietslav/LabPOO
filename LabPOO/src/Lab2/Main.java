package Lab2;

public class Main {
    public static void main(String[] args) {

        Headphone headphone = new Headphone("Logitech", "ProX", "Black", 91);
        Keyboard keyboard = new Keyboard("Dark Project", "KD83A", "Metal", 75);
        Mouse mouse = new Mouse("Logitech", "G502", 25600);
        Microphone microphone = new Microphone("FiFine", "K669", 20000);

        headphone.setColor("Black");
        System.out.println(headphone.getColor());
        System.out.println(headphone);

        keyboard.setTypeKey("Matal");
        System.out.println(keyboard.getTypeKey());
        System.out.println(keyboard);

        mouse.setFrequency(25600);
        System.out.println(mouse.getFrequency());
        System.out.println(mouse);

        microphone.setFrequency(20000);
        System.out.println(microphone.getFrequency());
        System.out.println(microphone);
    }
}
