package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220825 이름: 하늘새미");

        Charger charger = new KoreanOutletAdapter();

        // Charger charger = (Charger) adapter;

        // 스마트폰 충전
        Smartphone smartphone = new Smartphone(charger);
        smartphone.charge();
    }
}
