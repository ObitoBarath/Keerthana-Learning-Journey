package keerthana;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Workers extends Thread  {


//    Future & Callable ,CountDownLatch


    @Override
    public void run() {
        System.out.println("Thread is running");


    }
    // Threads         --> class level inheritance
    // Runnable        --> class level inheritance

    /* Dead Lock   - 2 threads waiting for each other to release resources
    * Methods in Thread class
    *
    * start(), run(), sleep(), join(), interrupt(), isAlive() , priority(), wait(), notify(), notifyAll(),
    *
    * manual workers , executor service
    *
    */


    public static synchronized void executeTask() {
        // Synchronized method to ensure that only one thread can execute this method at a time
        System.out.println("Executing task in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulating some work with sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Workers worker1 = new Workers();
        Workers worker2 = new Workers();

        for (int i = 0; i < 100; i++) {
            worker1.start(); // starts the thread and calls run() method
        }



//Thread Lifecycle


// New: Thread is created but not started yet
// Runnable: Thread is ready to run and waiting for CPU time
// Blocked: Thread is waiting for a resource that is currently held by another thread
// Waiting: Thread is waiting for another thread to perform a particular action
// Timed Waiting: Thread is waiting for another thread to perform an action for a specified period
// Terminated: Thread has completed its execution or has been stopped
        try {

            worker1.join(); // waits for worker1 to finish execution

            worker1.wait(); // waits for worker1 to finish execution

            worker1.notify(); // wakes up the worker1 thread if it is waiting


           //todo learn
            worker2.sleep(1000); // puts worker2 to sleep for 1000 milliseconds

            worker1.wait(1000); // waits for worker1 to finish execution for 1000 milliseconds

            worker1.notifyAll(); // wakes up all threads waiting on worker1

            worker1.interrupt(); // interrupts the worker1 thread if it is waiting or sleeping

            worker1.setPriority(123); // sets the priority of worker1 thread

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }




    public static void  getExecutorService() {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<String> list = List.of("keerthana", "keerthana", "keerthana", "keerthana", "keerthana");
        executorService.execute(() -> {

            System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());

            synchronized (list){

            }
            executeTask();

        });

        executorService.shutdown();
        executorService.close();


        try(ExecutorService executor = Executors.newCachedThreadPool()) {
            executor.execute(() -> {
                System.out.println("Task is running in thread: " + Thread.currentThread().getName());
            });

        }catch (Exception e){

        }

    }



}
