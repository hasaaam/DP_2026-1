package practice.ch05.ex;

public class Main extends Thread{
    public static void main(String[] args) {
        Thread a = new Main("Thread-A");
        Thread b = new Main("Thread-B");
        Thread c = new Main("Thread-C");

        a.start();
        b.start();
        c.start();
        
    }

    @Override
    // Thread의 run() 메서드를 오버라이드함.
    // 이 스레드가 실행할 코드
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(getName()+": "+singleton);
    }
    
    public Main(String name) {
        super(name);
    }
}
