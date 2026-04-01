package hw.ch04;

import hw.ch04.LicenseCard.LicenseCardFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220825 이름: 하늘새미");

        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();

        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();

    }
    
}
