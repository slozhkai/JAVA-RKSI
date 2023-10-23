//Билеты

class Tickets extends Theatre{


    private String performance; //Название представления
    private String date; //Дата проведения
    public static double cost = 1499.99;  //Неизменяемая цена за любой билет
    public static double add;


    public Tickets(String title, String address, int year, String name, boolean canteen, String type, String performance, String date, double cost, double add){
        super(title, address, year, name, canteen, type);
        this.performance = performance;
        this.date = date;
        this.cost = cost;
        this.add = add;
    }


    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }
    public static void addTicket(double a){
        add = a * cost;
        System.out.print("\nВаши билеты стоят: " + add);
    }

    @Override
    public void display() {
        System.out.println("\nВаш билет: ");
    }

    @Override
    public String toString(){
        return super.toString() + "\nНазвание представления: " + performance + "\nДата проведения: " + date + "\nСтоимость одного билета: " + cost + "руб"
                + "\nВаши билеты стоят: : " + add + "руб.";
    }




}
