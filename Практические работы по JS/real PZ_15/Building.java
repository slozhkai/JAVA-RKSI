public abstract class Building {
    private String title;
    private String address;
    private int year;
    private String name;
    private boolean culture;


    public Building(String title, String address, int year, String name, boolean culture) {
        this.title = title;
        this.address = address;
        this.year = year;
        this.name = name;
        this.culture = culture;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public boolean getCulture() {
        return culture;
    }


    public abstract void display();

    @Override
    public String toString() {
        return "title: " + title + "\nAddress: " + address + "\nyear: " + year
                + "\nname: " + name + "\nculture: " + culture;
    }
}




