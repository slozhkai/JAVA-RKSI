class Writer extends Library {
    private String dateOfBirth;
    private String dateOfDeath;
    private Person person;

    public Writer(String title, String address, int year, String name, boolean online,  Person person, String dateOfBirth, String dateOfDeath){
        super(title, address, year, person.getName(), online);
        this.dateOfBirth = dateOfBirth;
        this.person = person;
        this.dateOfDeath = dateOfDeath;

    }


    public String getDaterOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getYearOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String DateOfDeath) {
        this.dateOfDeath = DateOfDeath;
    }

    @Override
    public void display() {

    }
    @Override
    public String toString() {
        return super.toString() + "\ndateOfBirth: " + dateOfBirth + "\nDateOfDeath: " + dateOfDeath + "\nName: " + person.getName() + "\nSurname: " + person.getSurname() ;
    }
}
