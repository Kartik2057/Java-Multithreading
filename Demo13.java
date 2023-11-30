public class Demo13 extends Thread{
    static Thread mainthread;
    public void run() {
        try {
            //Here child method waits for the main method to complete the execution
            mainthread.join();
            for (int i = 0; i <5; i++) {
                System.out.println("Child method"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        mainthread = Thread.currentThread();
        Demo13 d= new Demo13();
        d.start();
        try {
            // d.join();
            //Here main thread waits for another thread to complete
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            
        }
    }
}
