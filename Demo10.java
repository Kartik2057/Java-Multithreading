public class Demo10 extends Thread {

    public void run() {

        for (int i = 1; i <= 5;i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
    public static void main(String[] args) throws InterruptedException{
        // HERE MAIN METHOD IS BEING STOPPED AFTER EVERY DISPLAY 
        // for (int i = 1; i <= 5; i++) {
        //     try {
        //         //For giving 1 sec delay n printing 
        //         Thread.sleep(1000);
        //         System.out.println(i);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
            // }

             
            for (int i = 1; i <= 5;i++) {
                    Thread.sleep(1000);
                    System.out.println(i);
            }
        
        // Demo10 d= new Demo10();
        // d.start();
    }
}
