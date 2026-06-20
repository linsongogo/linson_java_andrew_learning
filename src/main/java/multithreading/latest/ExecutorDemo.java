package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {



  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(4);
    ExecutorService executor1 = Executors.newFixedThreadPool(4);

    // Submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 100));
    executor.execute(new PrintChar('b', 100));
//    executor1.execute(new AddCount2());


    System.out.println(" is shutdown:"+executor.isShutdown());
    // Shut down the executor
    executor.shutdown();
    System.out.println(" is shutdown:"+executor.isShutdown());

    System.out.println(" is terminated:"+executor.isTerminated());
    while (!executor.isTerminated()){
    }
    System.out.println(" is terminated:"+executor.isTerminated());



class AddCount3 implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i<20; i++){
      int count = i;
    }

  }
}







  }
}