public class demo9 extends Thread {

    public void run(){
          System.out.println("Child thread");
          System.out.println("child thread priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread old priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY); 
        demo9 d= new demo9();
        d.setDaemon(true);
        d.start();
        System.out.println("Main Thread new priority : "+Thread.currentThread().getPriority());
    }
}
