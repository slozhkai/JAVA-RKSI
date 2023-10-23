public class Book implements Printable {
    private int year;
    private String title;
    private String language;

    public Book(String language, int year, String title) {
        this.language = language;
        this.year = year;
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void print() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Language: " + this.language);
        System.out.println("Year: " + this.year);
    }
}