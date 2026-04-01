package hw.ch04.LicenseCard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {

    private String baseDate;
    private int licenseCounter = 100;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }   

    @Override
    protected Product createProduct(String owner) {
        return new LicenseCard(owner, licenseCounter++, baseDate, "2031-03-19");
    }

    @Override
    protected void registerProduct(Product product) {
        String owner = ((LicenseCard) product).getHolder();
        System.out.println(owner + "의 운전면허증을 " + licenseCounter+ "번으로 만듭니다.");
    }
    
}
