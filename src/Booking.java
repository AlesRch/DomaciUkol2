import java.time.LocalDate;

public class Booking {
    private int room;
    private String guest;
    private String otherGuests;
    private LocalDate startdate;
    private LocalDate finisdate;
    private String typeOfVacation;


    public Booking(int room, String guest, String otherGuests, LocalDate startdate, LocalDate finisdate, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.startdate = startdate;
        this.finisdate = finisdate;
        this.typeOfVacation = typeOfVacation;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(String otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getFinisdate() {
        return finisdate;
    }

    public void setFinisdate(LocalDate finisDate) {
        this.finisdate = finisdate;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public String getDescription() {
        return "Room: " + getRoom()+"," + " Guest: " +getGuest()+"," + " Other Guests: " +getOtherGuests()+"," + " Arrival: " + getStartdate()+"," + " Departuere: " +getFinisdate()+"," + " Type of Vacation: " +getTypeOfVacation()+",";
    }
}
