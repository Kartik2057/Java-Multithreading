public class OfficerSign extends Thread{
    public void run() {
       try {
           System.out.println("Officer sign starts");
           Thread.sleep(3000);
           System.out.println("Officer sign completes");
       } catch (Exception e) {
           // TODO: handle exception
       }
    }
}