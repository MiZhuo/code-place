package thread;

/**
 * @author mizhuo
 */
public class Thread2 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread2());
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类创建");
            }
        });
        thread2.start();

        Thread thread3 = new Thread(()->{System.out.println("使用Lambda表达式创建");});
        thread3.start();
    }

    @Override
    public void run() {
        System.out.println("第二种线程的创建方式,也是最常用的方式!");
    }
}
