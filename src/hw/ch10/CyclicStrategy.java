package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int idx;

    public CyclicStrategy() {
        idx = -1;
    }

    @Override
    public void study(boolean win) {
        // Implementation for studying the game results
    }

    @Override
    public Hand nextHand() {
        idx = (idx + 1) % 3; // Cycle through the hands
        return Hand.getHand(idx);
    }
}
