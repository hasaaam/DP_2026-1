package hw.ch02;

public class KoreanOutletAdapter extends KoreanOutlet implements Charger{
    
        @Override
        public int charge() {
            System.out.println("스마트폰을 충전합니다.");
            
            int voltage = this.provide();

            return voltage;
        }
}
