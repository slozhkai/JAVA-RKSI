public class Library {
    private String title;
    private String address;
    private int year;
    private String name;
    private static boolean online = true;


    public Library(String title, String address, int year, String name, boolean online) {
        this.title = title;
        this.address = address;
        this.year = year;
        this.name = name;
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

    public static boolean isOnline() {
        return online;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return "title: " + title + "\nAddress: " + address + "\nyear: " + year
                + "\nname: " + name + "\nOnline: " + online;
    }
}
