//Амфитеатр

class Amphitheater extends Theatre{
    private double semicircle; //Диаметр полукруга
    private boolean textile; //Мягкий или твердый материал на сидениях
    private boolean audibility; //Хорошоая ли слышимость



    public Amphitheater(String title, String address, int year, String name, boolean canteen, String type, double semicircle, boolean textile, boolean audibility){
        super();
        this.semicircle = semicircle;
        this.textile = textile;
        this.audibility = audibility;
    }



    public double getSemicircle() {
        return semicircle;
    }

    public void setSemicircle(double semicircle) {
        this.semicircle = semicircle;
    }

    public boolean isTextile() {
        return textile;
    }

    public void setTextile(boolean textile) {
        this.textile = textile;
    }

    public boolean isAudibility() {
        return audibility;
    }

    public void setAudibility(boolean audibility) {
        this.audibility = audibility;
    }

    @Override
    public void display(){
        System.out.println("Вы в Амфитеатре");
    }


    @Override
    public String toString(){
        return super.toString() + "\nДиаметр полукруга театра: " + semicircle + "\nМягкий или твердый материал сидений(true - мягкий, false - твёрдый: "
                + textile + "\nХорошая ли слышимость: " + audibility;
    }
}
