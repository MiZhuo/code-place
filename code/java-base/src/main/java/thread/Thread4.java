package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mizhuo
 */
public class Thread4 implements Runnable {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Thread4());
    }

    @Override
    public void run() {
        System.out.println("第四种线程的创建方式:使用线程池,但不建议使用Executors创建," +
                "Executors创建线程使用了LinkedBlockingQueue无界阻塞队列,如果过多的任务加入到队列中,会导致内存耗尽,从而OOM!");
    }
}
