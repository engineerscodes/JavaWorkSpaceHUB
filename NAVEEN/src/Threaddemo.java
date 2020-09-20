/**
 * 
 */

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
class Threads extends Thread {
 synchronized void waiting() {
  try {
   System.out.println("wait"+Thread.currentThread().getName());
   wait();
  } catch (InterruptedException e) {
  }
 }
 synchronized void notifying() {
  System.out.println("notify me"+Thread.currentThread().getName());
  notify();
 }
}
public class Threaddemo {
 public static void main(String args[]) {
  Threads t1=new Threads();
  t1.setName("first");
  Threads t2=new Threads();
  t2.setName("second");
  t1.start();
  t2.start();
 }
}