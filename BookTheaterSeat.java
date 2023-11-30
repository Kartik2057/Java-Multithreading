public class BookTheaterSeat extends Thread{
    static int total_seats=20;
    
    static synchronized void bookSeat(int seats) {
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
 
        if (total_seats>=seats) {
            System.out.println(seats+" Seats Booked Successfully");
            total_seats =total_seats-seats;
            System.out.println("Seats Left: "+total_seats);
        } else {
            System.out.println("Sorry "+seats+" seats cannot book seats are full");
            System.out.println("Seats Left : "+total_seats);
        }
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
        // System.out.println("hi : "+Thread.currentThread().getName());
    }
}
