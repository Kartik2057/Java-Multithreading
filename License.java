public class License{
    public static void main(String[] args) throws InterruptedException{
        Medical m=new Medical();
        m.start();
        m.join();//Thread t waits for the m thread to complete
        TestDrive t= new TestDrive();
        t.start();
        t.join();//Thread o waits for the thread t to complete
        OfficerSign o=new OfficerSign();
        o.start();
    }
}


