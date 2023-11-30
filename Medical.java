public class Medical extends Thread{
    public void run() {
        try {
            System.out.println("Medical starts");
            Thread.sleep(3000);
            System.out.println("Medical completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}