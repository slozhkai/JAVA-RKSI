//Билеты

class Tickets extends Theatre{


    private String performance; //Название представления
    private String date; //Дата проведения
    public static double cost = 1499.99;  //Неизменяемая цена за любой билет


    public Tickets(String title, String address, int year, String name, boolean canteen, String type, String performance, String date, double cost){
        super();
        this.performance = performance;
        this.date = date;
        this.cost = cost;
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

    @Override
    public void display() {
        System.out.println("Ваш билет: ");
    }

    @Override
    public String toString(){
        return super.toString() + "\nНазвание представления: " + performance + "\nДата проведения: " + date + "\nСтоимость одного билета: " + cost + "руб.";
    }

    public static void addTicket(double a){
        double add = a * cost;
        System.out.print("\nВаши билеты стоят: " + add);
    }
}
