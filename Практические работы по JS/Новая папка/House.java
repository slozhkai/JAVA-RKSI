class House extends Building implements LivingHouse{
    private int floors;
    private int toilets;
    private boolean podval;
    public House(String title, String address, int year, String name, boolean culture, int floors, int toilets, boolean podval){
        super(title, address, year, name, culture);
        this.floors = floors;
        this.toilets = toilets;
        this.podval = podval;
    }
    public int getfloors(){
        return  floors;
    }
    public void setfloors(int floors){
        this.floors = floors;
    }

    public int gettoilets(){
        return  toilets;
    }
    public void settoilets(int toilets){
        this.toilets = toilets;
    }

    public boolean getpodval(){
        return  podval;
    }
    public void setpodval(boolean podval){
        this.podval = podval;
    }

    @Override
    public void display(){
        System.out.println("Это дом)");
    }

    @Override
    public String toString(){
        return super.toString() + "\nСколько этажей?: " + floors + "\nКоличество тубзиков: " + toilets + "\nЕсть ли подвал: " + podval;
    }

    @Override
    public void setToilets(int toilets) {

    }

    @Override
    public boolean podval() {
        return false;
    }
}



