package lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;


/**
 * @author mizhuo
 */
public class Lock {

    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();

        System.out.println( "--MAIN--:"+ ClassLayout.parseInstance(obj).toPrintable());

        Thread thread1 = new Thread(() -> {

            synchronized(obj) {

                System.out.println( "--THREAD1--:"+ ClassLayout.parseInstance(obj).toPrintable());

                try{

                    TimeUnit.SECONDS.sleep( 5);

                } catch(InterruptedException e) {

                    e.printStackTrace();

                }

            }

        });

        Thread thread2 = new Thread(() -> {

            try{

                TimeUnit.SECONDS.sleep( 2);

            } catch(InterruptedException e) {

                e.printStackTrace();

            }

            synchronized(obj) {

                System.out.println( "--THREAD2--:"+ ClassLayout.parseInstance(obj).toPrintable());

            }

        });

        thread1.start();

        thread2.start();

        thread1.join();

        thread2.join();

        TimeUnit.SECONDS.sleep( 3);

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

    }
}
