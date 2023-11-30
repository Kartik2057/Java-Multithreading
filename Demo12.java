public class Demo12 extends Thread{
    public void run() {
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
    public static void main(String[] args) {
        Demo12 t=new Demo12();
        t.start();

        // Thread.yield();//Executed by main thread but it may accept it or not 
        for (int i = 1; i<=5; i++) {
            System.out.println("main thread"+i);
        }
    }
}
