package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
The first thread prints the letter a 100 times.
The second thread prints the letter b 100 times.
The third thread prints the integers 1 through 100.
 */
public class TaskThreadDemo1 {

  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(4);

    // Submit runnable tasks to the executor
    executor.execute(new PrintChar1('a', 100));
    executor.execute(new PrintChar1('b', 100));



    System.out.println(" is shutdown:"+executor.isShutdown());
    // Shut down the executor
    executor.shutdown();
    System.out.println(" is shutdown:"+executor.isShutdown());

    System.out.println(" is terminated:"+executor.isTerminated());
    while (!executor.isTerminated()){
    }
    System.out.println(" is terminated:"+executor.isTerminated());
  }
}



// The task for printing a specified character in specified times
class PrintChar1 implements Runnable {

  private char charToPrint; // The character to print
  private int times; // The times to repeat

  /**
   * Construct a task with specified character and number of times to print the character
   */
  public PrintChar1(char c, int t) {
    charToPrint = c;
    times = t;
  }

  @Override
  /** Override the run() method to tell the system
   *  what the task to perform
   */
  public void run() {
    for (int i = 0; i < times; i++) {
      System.out.print(charToPrint);
    }
  }
}

// The task class for printing number from 1 to n for a given n
class PrintNum1 implements Runnable {

  private int lastNum;

  /**
   * Construct a task for printing 1, 2, ... i
   */
//  public PrintNum(int n) {
//    lastNum = n;
//  }

  @Override
  /** Tell the thread how to run */
  public void run() {
    lastNum = 100;

    Thread thread4 = new Thread(new PrintChar('c', 100));
    thread4.start();

    for (int i = 1; i <= lastNum; i++) {
      System.out.print(" " + i);
//      Thread.yield(); //暂停
//        try {
//          Thread.sleep(100); //休眠  会抛出必检异常
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//
        if (i == 20) {
//          thread4.start();
          try {
            thread4.join(); // 等待此线程结束  会抛出必检异常
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
    }


  }
}

