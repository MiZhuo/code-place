package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author mizhuo
 */
public class Thread3 implements Callable<String>{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask(new Thread3());
        Thread thread = new Thread(task);
        thread.start();
        String res = task.get();
        System.out.println(res);
    }

    @Override
    public String call() throws Exception {
        return "第三种线程的创建方式:实现Callable接口,可以获取返回结果。";
    }
}
