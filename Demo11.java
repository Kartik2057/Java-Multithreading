public class Demo11 extends Thread{

    public void run() {
        try {
            for (int i = 1; i <=5; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
              System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
       Demo11 d1=new Demo11(); 
       Demo11 d2=new Demo11();
       //This is manual calling of run method and not starting of thread.
    //    d1.run();
    //    d2.run(); 
    //Execute simultaneously
    d1.start();
    d2.start();
    }
}
