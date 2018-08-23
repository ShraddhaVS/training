package week5;

import java.lang.*;


class MyThread1 extends Thread
{
 public void run()
 {
     for (int i=0; i<5 ; i++)
         System.out.println(Thread.currentThread().getName()
                             + " in control");
 }
}

public class YieldExample
{
 public static void main(String[]args)
 {
     MyThread1 t = new MyThread1();
     t.start();

     for (int i=0; i<5; i++)
     {
         Thread.yield();

         System.out.println(Thread.currentThread().getName()
                             + " in control");
     }
 }
}

