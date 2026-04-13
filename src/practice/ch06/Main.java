package practice.ch06;

import practice.ch06.framework.Manager;

public class Main {
    public static void main(String[] args) {
        //원본울 이용
        // MessageBox mbox = new MessageBox('*');
        // mbox.use("Hello, Prototype Pattern!");

        // UnderlinePen upen = new UnderlinePen('-');
        // upen.use("Hello, Prototype Pattern!");

        // //복제 객체 이용
        // mbox.createCopy().use("hello, world.");
        // upen.createCopy().use("hello, world.");


        Manager manager = new Manager();

        MessageBox mbox = new MessageBox('*');
        manager.register("star box", mbox);
        UnderlinePen upen = new UnderlinePen('-');
        manager.register("underline box", upen);


        manager.create("star box").use("hello, world.");
        manager.create("underline box").use("hello, world.");

    }
    
}
