package practice.ch20;

public class Main {
    public static void main(String[] args) {
        // if (args.length == 0) {
        //     System.out.println("Usage: java Main digits");
        //     System.out.println("Example: java Main 1212123");
        //     System.exit(0);
        // }

        BigChar bigChar = new BigChar('1');
        bigChar.print();

        BigCharFactory factory = BigCharFactory.getInstance();
        BigChar bigChar1 = factory.getBigChar("1".charAt(0));
        bigChar1.print();
        BigChar bigChar2 = factory.getBigChar("1".charAt(0));
        bigChar2.print();

        if(bigChar1 == bigChar2) {
            System.out.println("bigChar1과 bigChar2는 같은 인스턴스입니다.");
        } else {
            System.out.println("bigChar1과 bigChar2는 다른 인스턴스입니다.");
        }
        // BigString bs = new BigString(args[0]);
        // bs.print();
    }
}
