//Бельэтаж

class Mezzanine extends Theatre{
    private int tier; //На каком ярусе расположен
    private boolean waiter; //Есть ли официанты
    private int entrance; //Сколько есть входов



    public Mezzanine(String title, String address, int year, String name, boolean canteen, String type, int tier, boolean waiter, int entrance){
        super(title, address, year, name, canteen, type);
        this.tier = tier;
        this.waiter = waiter;
        this.entrance = entrance;
    }



    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public boolean isWaiter() {
        return waiter;
    }

    public void setWaiter(boolean waiter) {
        this.waiter = waiter;
    }

    public int getEntrance() {
        return entrance;
    }

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }


    @Override
    public void display() {
        System.out.println("Вы на Бельэтаже");
    }

    @Override
    public String toString(){
        return super.toString() + "\nНа каком ярусе расположен: " + tier + "\nЕсть ли официанты: " + waiter + "\nСколько есть входов: " + entrance;
    }
}
