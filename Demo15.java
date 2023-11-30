public class Demo15 extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
    }
    public static void main(String[] args) {
        Demo15 d= new Demo15();
        d.start();
        d.interrupt();
    }
}
