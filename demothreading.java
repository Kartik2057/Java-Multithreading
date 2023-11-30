
public class demothreading implements  Runnable{
   public void run(){
     System.out.println("Thread Task using runnable");
   }
   public static void main(String[] args) {
      demothreading t=new demothreading();
      Thread th =new Thread(t);
      th.start();
    //   t.start(); runtime error
   }
}