/**
 * Here The data inconistency problem will be with the objects going from deffent objects of bookn theater seat class. 
 */
public class MovieBookApp2 {
   public static void main(String[] args) throws InterruptedException{
    // BookTheaterSeat b1=new BookTheaterSeat();
    // MyThread1 t1=new MyThread1(b1, 7);
    // t1.start();
    // MyThread2 t2=new MyThread2(b1, 6);
    // t2.start();
    

    // BookTheaterSeat b2=new BookTheaterSeat();
    // MyThread1 t3=new MyThread1(b2, 8);
    // t3.start();
    // MyThread2 t4 = new MyThread2(b2, 9);
    // t4.start();
      TotalEarnings te= new TotalEarnings();
      te.start();
    //   System.out.println("Total Earnings is "+te.total);
      
      synchronized(te){

          te.wait();//Tells the main THread to wait for the thread te to complete    
          System.out.println("Total Earnings is "+te.total);
      }

    }
    
}