//Daemon Threads run in background in java 
// It provides service to the Threads
// eg:- garbage collector, finalizer, Attach listeners, signal dispatchers etc

public class demo8 extends Thread{

    public void run(){
        System.out.println();
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName()+"is Daemon Thread");
        } else {
            System.out.println(Thread.currentThread().getName()+"is Child thread");
        } 
    }
    
    public void print(){
        System.out.println("In print : "+Thread.currentThread().isDaemon());
        // demo8 t2=new demo8();
        // System.out.println(t2.isDaemon()); 
    }

    public static void main(String args[]) {
        //If main thread does not do any service then daemon thread is not executed
        System.out.println("main method");
        //java.lang.IllegalThreadStateException
        // Thread.currentThread().setDaemon(true);
        System.out.println("main is daemon : "+ Thread.currentThread().isDaemon() );
        demo8 t= new demo8();
        t.setDaemon(true);
        // System.out.println("In main : " + t.isDaemon());
        // t.print();
        t.start();
        
    }
}
