package thread;

/**
 * @author mizhuo
 */
public class Thread1 extends Thread{
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("第一种线程的创建方式,缺点是占用了继承的名额!因为Java中类是单继承的");
    }
}
