//Туалет

class Toilet extends Theatre{
    private int pan; //Количество унитазов
    private boolean urinal; //Есть ли писуары
    private int number_urinal; //Количество писуаров
    private boolean man_wooman; //Есть ли разделение на мужские и женские кабинки

    public Toilet(String title, String address, int year, String name, boolean canteen, String type, int pan, boolean urinal, int number_urinal, boolean man_wooman) {
        super();
        this.pan = pan;
        this.urinal = urinal;
        this.number_urinal = number_urinal;
        this.man_wooman = man_wooman;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public boolean isUrinal() {
        return urinal;
    }

    public void setUrinal(boolean urinal) {
        this.urinal = urinal;
    }

    public int getNumber_urinal() {
        return number_urinal;
    }

    public void setNumber_urinal(int number_urinal) {
        this.number_urinal = number_urinal;
    }

    public boolean isMan_wooman() {
        return man_wooman;
    }

    public void setMan_wooman(boolean man_wooman) {
        this.man_wooman = man_wooman;
    }


    @Override
    public void display() {
        System.out.println("Вы в туалете");
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество унитазов: " + pan + "\nЕсть ли писуар: " + urinal + "\nКоличество писуаров: " + number_urinal + "\nЕсть ли разделение на мужские и женские кабинки: " + man_wooman;
    }
}
