public class MyThread2 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b, int seats){
        this.b=b;
        this.seats= seats;
    }
    public void run() {
       BookTheaterSeat.bookSeat(seats);
    }
}
