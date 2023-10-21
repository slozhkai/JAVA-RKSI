//Главный зал
class MainHall extends Theatre{
    private int floors; //Количество комнат
    private  int bench; //Количество скамеек
    private boolean mirror; //Есть ли зеркало

    public MainHall(String title, String address, int year, String name, boolean canteen, String type, int floors, int bench, boolean mirror){
        super(title, address, year, name, canteen, type);
        this.floors = floors;
        this.bench = bench;
        this.mirror = mirror;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getBench() {
        return bench;
    }

    public void setBench(int bench) {
        this.bench = bench;
    }

    public boolean isMirror() {
        return mirror;
    }

    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }


    @Override
    public void display(){
        System.out.println("Вы в главном зале");
    }


    @Override
    public String toString(){
        return super.toString() + "\nКоличество комнат: " + floors + "\nКоличество скамеек: " + bench + "\nЕсть ли зеркало: " + mirror;
    }
}
