package practice.ch02.inheritance;

public class PrintBannerAdapter01 extends Banner implements Print {
    public PrintBannerAdapter01(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
