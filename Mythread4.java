import java.lang.*;
import java.util.*;

class Marvellous extends Thread
{
  public void run()     //state Running
  {
      System.out.println("Inside Thread:"+Thread.currentThread().getName());
      System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
  }
}


class Mythread4
{
   public static void main(String ar[])
   {
      System.out.println("Main Thread priority is:"+Thread.currentThread().getPriority());
      
      Marvellous mobj1 = new Marvellous();
      Thread t1 = new Thread(mobj1,"First");      //state new
      
      Marvellous mobj2 = new Marvellous();
      Thread t2 = new Thread(mobj2,"Second");
      
      t1.setPriority(10);
      t2.setPriority(2);
      
      t1.start();       //Runnable state
      t2.start();       //Runnable state
      
      System.out.println("End of main thread");
   }
}
