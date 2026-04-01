package practice.ch05;

public class Singleton {

    // 3. Singleton 객체를 미리 하나 만들어서 static 변수에 저장해둔다.
    private static Singleton instance = new Singleton(); // Singleton 객체를 저장할 변수
    
    // 1. 생성자를 private으로 한다.
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }   

    // 2. Singleton 객체를 얻어가는 메소드 정의
    public static Singleton getInstance(){
        return instance;
    }

}
