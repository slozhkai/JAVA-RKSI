//Балкон

class Balcony extends Theatre{
    double rise; //Высота балкона
    boolean WC; //Есть ли отдельный туалет
    double length; //Длина балкона


    public Balcony(String title, String address, int year, String name, boolean canteen, String type, double rise, boolean WC, double length){
        super(title, address, year, name, canteen, type);
        this.rise = rise;
        this.WC = WC;
        this.length = length;
    }


    public double getRise() {
        return rise;
    }

    public void setRise(double rise) {
        this.rise = rise;
    }

    public boolean isWC() {
        return WC;
    }

    public void setWC(boolean WC) {
        this.WC = WC;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void display() {
        System.out.println("Вы на Балконе");
    }

    @Override
    public String toString(){
        return super.toString() + "\nВысота балкона: " + rise + "\nЕсть ли отдельный туалет: " + WC + "\nДлина балкона: " + length;
    }
}
