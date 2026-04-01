package hw.ch03;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번: 20220825 이름: 하늘새미");


        AbstractDisplay d1 = new CharDisplay('H'); //기본 5 회
        AbstractDisplay d2 = new StringDisplay("Hello"); // 기본 5 회


        d1.display();
        d2.display();

        d1 = new CharDisplay('X', 3); //3 회
        d2 = new StringDisplay("Test", 7); // 7회

        d1.display();
        d2.display();

        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();

    }
}
