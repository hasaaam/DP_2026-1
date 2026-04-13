package practice.ch10;

public class Main {
    public static void main(String[] args) {
        // Hand h1 = Hand.ROCK;
        // Hand h2 = Hand.SCISSORS;

        // System.out.println(h1 + " vs " + h2);

        // if (h1.isStrongerThan(h2)) {
        //     System.out.println("h1이 이겼습니다.");
        // } else if (h1.isWeakerThan(h2)) {
        //     System.out.println("h2가 이겼습니다.");
        // } else {
        //     System.out.println("비겼습니다.");
        // }

        Player player1 = new Player("Taro", new WinningStrategy(314));
        Player player2 = new Player("Hana", new WinningStrategy(15));

        for(int i = 0; i < 100; i++) {
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (h1.isWeakerThan(h2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
    }
}
