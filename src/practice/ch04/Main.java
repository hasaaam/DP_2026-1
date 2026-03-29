package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // IDCard c = new IDCard("하늘새미");
        // c.use();

        IDCardFactory factory = new IDCardFactory();
        Product c =  factory.create("하늘새미");
        c.use();

    }
    
}
