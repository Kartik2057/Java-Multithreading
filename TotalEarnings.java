public class TotalEarnings extends Thread{
    int total=0;

    synchronized public void run() {
        for(int i=1;i<=10;i++)
        {
            total+=100;
        }
        this.notify();
    }
}
