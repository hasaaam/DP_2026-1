package practice.ch05;

public enum Singleton2 {
    INSTANCE; //상수: singleton2 타입 객체가 생성되어 저장됨.

    private Singleton2() {
        System.out.println("Singleton2 객체가 생성됩니다.");
    }

    public void hello(){
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다.");
    }

}
