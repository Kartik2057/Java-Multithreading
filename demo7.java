
public class demo7 extends Thread{

    public void run() {
       // EXECUTED BY THREAD 0
       System.out.println("run is executed by : "+Thread.currentThread().getName());//thread 0 
       System.out.println("Thread task");  
    }


    public static void main(String[] args) {
    //   THIS PART EXECUTES WITHOUT EXTENDING THREAD CLASS  
    //  System.out.println("Hello");
    //  System.out.println(Thread.currentThread().getName());
    //  Thread.currentThread().setName("Kartik");
    //  System.out.println(10/0);
    



    //THIS BLOCK IS EXECUTED BY MAIN THREAD
    System.out.println("Hello is printed by : "+Thread.currentThread().getName());
    
    demo7 t = new demo7();//NAME GIVEN BY JVM "THREAD 0"
    t.setName(" Kartik ");
    t.start();
    
    demo7 t2 = new demo7();//NAME GIVEN BY JVM "THREAD 1"
    t2.setName("Mehandiratta");
    t2.start(); 
    
    System.out.println("In am in : "+Thread.currentThread().getName());//main
    System.out.println(Thread.currentThread().isAlive());
    System.out.println(t.isAlive());
    System.out.println(t2.isAlive());
   }
}
