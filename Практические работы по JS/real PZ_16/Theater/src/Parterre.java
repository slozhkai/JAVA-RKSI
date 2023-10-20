//Партер

class Parterre extends Theatre{
    private int seats; //Количество мест
    boolean pince_nez; //Нужны ли Пенсе(очки для приближения)
    boolean orchestra; //Есть ли яма с окестром

    public Parterre(String title, String address, int year, String name, boolean canteen, String type, int seats, boolean pince_nez, boolean orchestra){
        super();
        this.seats = seats;
        this.pince_nez = pince_nez;
        this.orchestra = orchestra;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean ispince_nez() {
        return pince_nez;
    }

    public void setpince_nez(boolean pince_nez) {
        this.pince_nez = pince_nez;
    }

    public boolean isorchestra() {
        return orchestra;
    }

    public void setorchestra(boolean orchestra) {
        this.orchestra = orchestra;
    }

    @Override
    public void display(){
        System.out.println("Вы в Партере");
    }


    @Override
    public String toString(){
        return super.toString() + "\nКоличество мест: " + seats + "\nНужны ли пенсе: " + pince_nez + "\nЕсть ли яма с оркестром: " + orchestra;
    }
}
