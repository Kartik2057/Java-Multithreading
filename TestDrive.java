public class TestDrive extends Thread{
    public void run() {
     try {
         System.out.println("Test Drive starts");
         Thread.sleep(3000);
         System.out.println("TestDrive completed");
     } catch (Exception e) {
         // TODO: handle exception
     }
    }
 }