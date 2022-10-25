public class CinemaTicket
{
    //attributes
    
    static String cinemaName = "City";
    String title;
    int row;
    int seat;
    double price;
    
    //methods
    public CinemaTicket(String title, int row, int seat){
        if(row <3){
            this.price = 10.00;
        }else{
            this.price = 25.00;
        }
        this.title = title;
        this.row = row;
        this.seat = seat;
    }
    
    public void displayTicket(){
        System.out.print(
            " --- Ticket Details --- \nMovie title: "+this.title
            +"\nCinema name: "+this.cinemaName
            +"\nRow no.: "+this.row
            +"\nSeat no.: "+this.seat
            +"\nPrice: "+this.price+"\n"
        );
        return;
    }
    
    public static void main(String[] args){
        CinemaTicket ticket1 = new CinemaTicket("Cloud Atlas", 1, 14);
        CinemaTicket ticket2 = new CinemaTicket("Mad Max: Fury Road", 8, 2);
        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}
