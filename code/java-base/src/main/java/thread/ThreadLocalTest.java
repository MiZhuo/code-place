package thread;

/**
 * @author mizhuo
 */
public class ThreadLocalTest {

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(()->{
                doA(Thread.currentThread().getId());
                doB(Thread.currentThread().getId());
            });
            thread.start();
        }
    }

   public static void doA(Long id){
       System.out.println("线程" + id + "执行doA方法");
       threadLocal.set("线程" + id + "在doA中设置的value");
   }

    public static void doB(Long id){
        System.out.println("线程" + id + "执行doB方法");
        String str = threadLocal.get();
        threadLocal.remove();
        System.out.println(str);
    }
}
