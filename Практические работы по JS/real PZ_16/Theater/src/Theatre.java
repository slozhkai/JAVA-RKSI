//Театр

public class Theatre {
    private String title; //Название театра
    private String address; //Адрес Театра
    private int year; //Год основания
    private String name; //В честь кого назван
    private boolean canteen; //Есть ли буфет
    private  String type; //Вид театра


    public Theatre(String title, String address, int year, String name, boolean canteen, String type){
        this.title = title;
        this.address = address;
        this.year = year;
        this.name = name;
        this.canteen = canteen;
        this.type = type;
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
    public boolean isCanteen() {
        return canteen;
    }
    public String getType() {
        return type;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return "Название: " + title + "\nАдрес: " + address + "\nГод основания: " + year
                + "\nИмя основателя: " + name + "\nЕсть ли буфет: " + canteen + "\nВид театра: " + type;
    }



    public void age(){
        if(year <= 2000){
            System.out.println(title + " " + name + " старый");
        }
        else{
            System.out.println(title + " " + name + " новый");
        }
    }

    public void addAge(int a){
        year = a;
    }
    public void setAge(int a){
        year = a + year;
    }
}
