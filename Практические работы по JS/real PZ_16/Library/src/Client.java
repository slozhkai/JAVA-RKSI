public class Client{
    private Person person;
    private boolean isdebts;
    private int id;

    public Client(Person person, boolean isdebts, int id){
        this.person = person;
        this.isdebts = isdebts;
        this.id = id;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isIsdebts() {
        return isdebts;
    }

    public void setIsdebts(boolean isdebts) {
        this.isdebts = isdebts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
