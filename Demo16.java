public class Demo16 extends Thread{
    public void run() {
        
        System.out.println(Thread.interrupted());// true -> false
        System.out.println(Thread.interrupted());// false
        System.out.println(Thread.interrupted());//false
        // does not change 
        // System.out.println(Thread.currentT hread().isInterrupted());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread is interrupted");
        }
    }
    public static void main(String[] args) {
        Demo16 d= new Demo16();
        d.start();
        d.interrupt();
    }
}
