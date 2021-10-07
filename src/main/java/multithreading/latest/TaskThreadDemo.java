package multithreading.latest;

/*
The first thread prints the letter a 100 times.
The second thread prints the letter b 100 times.
The third thread prints the integers 1 through 100.
 */
public class TaskThreadDemo {

  public static void main(String[] args) {
    // Create tasks
    Runnable printA = new PrintChar('a', 100);
    Runnable printB = new PrintChar('b', 100);
    Runnable print100 = new PrintNum(100);

    // Create threads
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);
    Thread thread3 = new Thread(print100);

    thread3.setPriority(Thread.MAX_PRIORITY);//设置优先级（并非设置了优先级就先执行）
    // Start threads
    thread1.start();
    thread2.start();
    thread3.start();

  }
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {

  private char charToPrint; // The character to print
  private int times; // The times to repeat

  /**
   * Construct a task with specified character and number of times to print the character
   */
  public PrintChar(char c, int t) {
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
class PrintNum implements Runnable {

  private int lastNum;

  /**
   * Construct a task for printing 1, 2, ... i
   */
  public PrintNum(int n) {
    lastNum = n;
  }

  @Override
  /** Tell the thread how to run */
  public void run() {
    Thread thread4 = new Thread(new PrintChar('c', 40));
    thread4.start();

    try {
      for (int i = 1; i <= lastNum; i++) {
        System.out.print(" " + i);
        Thread.yield(); //暂停
        try {
          Thread.sleep(100); //休眠  会抛出必检异常
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        if (i == 50) {
          thread4.join(); // 等待此线程结束  会抛出必检异常
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }
}

