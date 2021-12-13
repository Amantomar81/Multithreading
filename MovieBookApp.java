class BookTheaterSeat{
    int total_seats = 10;
   synchronized void bookSeat(int seats)
    {
        if(total_seats >= seats)
        {
            System.out.println("seat booked succesfully");
            total_seats = total_seats-seats;
            System.out.println("seats left"+ total_seats);
        }
        else {
            System.out.println("seats cannot be booked");
            System.out.println("seats left"+total_seats);
        }
    }
}
public class MovieBookApp extends Thread
{
    static BookTheaterSeat b;
    int seat;

    public void run() {
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        MovieBookApp Aman = new MovieBookApp();
        Aman.seat=7;
        Aman.start();
        MovieBookApp Saurabh = new MovieBookApp();
        Saurabh.seat = 6;
        Saurabh.start();
    }

}
