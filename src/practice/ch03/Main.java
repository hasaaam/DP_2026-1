package practice.ch03;

public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H'); // 'H', "H"
        // AbstractDisplay d1 = new CharDisplay('H'); // 'H', "H"
        d1.display();

        StringDisplay d2 = new StringDisplay("Hello, world."); // "Hello, world."
        // AbstractDisplay d2 = new StringDisplay("Hello, world."); // "Hello, world."
        d2.display(); 
    }
}
