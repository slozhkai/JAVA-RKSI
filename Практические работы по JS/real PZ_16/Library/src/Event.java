
class Event extends Library{
    private String Eventname;
    private String Descriptionn;
    private String dateAndTime;

    public Event(String title, String address, int year, String name, boolean online, String Eventname, String Descriptionn, String dateAndTime){
        super(title, address, year, name, online);
        this.Eventname = Eventname;
        this.Descriptionn = Descriptionn;
        this.dateAndTime = dateAndTime;
    }

    public String getEventname() {
        return Eventname;
    }

    public void setEventname(String eventname) {
        Eventname = eventname;
    }

    public String getDescriptionn() {
        return Descriptionn;
    }

    public void setDescription(String descriptionn) {
        Descriptionn = descriptionn;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public void display() {

    }
    public String toString(){
        return super.toString() + "\nСобытие: " + Eventname + "\nОписание: "
                + Descriptionn + "\nВремя проведения: " + dateAndTime;
    }
}
