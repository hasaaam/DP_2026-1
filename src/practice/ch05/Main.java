package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // 싱글톤 객체 가져오기
        // Singleton singleton1 = new Singleton(); // Singleton has private constructor, so this line will cause a compile-time error

        Singleton singleton2 = Singleton.getInstance(); // Singleton 객체가 생성됩니다.
        Singleton singleton3 = Singleton.getInstance(); // Singleton 객체가 생성됩니다.

        System.out.println("singleton2: " + singleton2);
        System.out.println("singleton3: " + singleton3);

        if(singleton2 == singleton3) {
            System.out.println("singleton2와 singleton3는 같은 객체입니다.");
        } else {
            System.out.println("singleton2와 singleton3는 다른 객체입니다.");
        }

        Singleton2 singleton4 = Singleton2.INSTANCE; // Singleton2 객체가 생성됩니다.
        singleton4.hello(); // 싱글톤 객체의 hello 메소드가 호출되었습니다.
    }
    
}
