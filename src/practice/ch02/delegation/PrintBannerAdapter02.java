package practice.ch02.delegation;

public class PrintBannerAdapter02 extends Print {
    private Banner banner;

    public PrintBannerAdapter02(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
    
}
