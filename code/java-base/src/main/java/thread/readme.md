#### 创建线程的方式
- 继承Thread类
- 实现Runnable接口
- 实现Callable接口
- 使用线程池

但归根结底,底层全部都是实现Runnable接口来创建线程的。

#### 线程池有哪些状态?每种状态分别表示什么?
- `RUNNING`
    > 表示线程正常运行,既能接受新的任务,也能正常处理队列中的任务。 
- `SHUTDOWN`
    > 当调用shutdown()方法时,线程池进入 SHUTDOWN 状态,表示线程池处于正在关闭状态,此状态下线程池不再接受新的任务,但会继续处理完队列中的任务。
- `STOP`
    > 当调用shutdownnow()方法时,线程池进入 STOP 状态,表示线程池处于正在停止状态,此状态下线程池不再接受新的任务,也不会再处理队列中的任务,并且正在处理的任务也会被中断。
- `TIDYING`
    > 线程池中没有任务在运行后,线程池的状态会自动变成 TIDYING状态 ,并且会调用terminated()方法,该方法为空方法,留给程序员进行扩展。
- `TERMINATED`
    > terminated()方法执行完之后,线程池会进入 TERMINATED 状态。
  > 
#### 线程池状态的转移 
- 当调用 shutdown() 方法时，线程池的状态会从 RUNNING 到 SHUTDOWN，再到 TIDYING，最后到 TERMINATED 销毁状态。
- 当调用 shutdownNow() 方法时，线程池的状态会从 RUNNING 到 STOP，再到 TIDYING，最后到 TERMINATED 销毁状态。

