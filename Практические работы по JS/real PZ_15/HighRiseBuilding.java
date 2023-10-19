class HighRiseBuilding extends Building implements SocialHouse{
    private boolean ladder;
    private double rise;
    private String material;

    public HighRiseBuilding(String title, String address, int year, String name, boolean culture, boolean ladder, double rise, String material){
        super(title, address, year, name, culture);
        this.ladder = ladder;
        this.rise = rise;
        this.material = material;
    }
    public boolean getladder(){
        return  ladder;
    }
    public void setLadder(boolean ladder){
        this.ladder = ladder;
    }

    public double getRise(){
        return  rise;
    }
    public void setRise(double rise){
        this.rise = rise;
    }

    public String getMaterial(){
        return  material;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    @Override
    public void display(){
        System.out.println("Это Высотка");
    }

    @Override
    public String toString(){
        return super.toString() + "\nЕсть пожарная лестница: " + ladder + "\nВысота: " + rise + "\nИз чего состоит: " + material;
    }


    public boolean ladder() {
        return false;
    }

    public void material(String all_day) {
    }
}

