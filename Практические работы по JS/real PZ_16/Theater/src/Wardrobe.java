//Гардероб

class Wardrobe extends Theatre{
    private int hanger; //ККОличество вешалок
    private int attendant; //Количество гардеробщиков
    private String tima; //Время работы гардероба



    public Wardrobe(String title, String address, int year, String name, boolean canteen, String type, int hanger, int attendant, String time) {
        super(title, address, year, name, canteen, type);
        this.hanger = hanger;
        this.attendant = attendant;
        this.tima = tima;
    }



    public int getHanger() {
        return hanger;
    }

    public void setHanger(int hanger) {
        this.hanger = hanger;
    }

    public int getAttendant() {
        return attendant;
    }

    public void setAttendant(int attendant) {
        this.attendant = attendant;
    }

    public String getTima() {
        return tima;
    }

    public void setTima(String tima) {
        this.tima = tima;
    }

    @Override
    public void display() {
        System.out.println("Вы в гардеробе");
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество вешалок: " + hanger + "\nСколько людей работает в гардеробе: " + attendant + "\nВремя работы гардероба: " + tima;
    }
}
