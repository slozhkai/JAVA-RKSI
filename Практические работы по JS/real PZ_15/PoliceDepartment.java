class PoliceDepartment extends Building {
    private boolean isSherif;
    private int trashes;
    private boolean monkey;
    public PoliceDepartment(String title, String address, int year, String name, boolean culture){
        super(title, address, year, name, culture);
        this.isSherif = isSherif;
        this.trashes = trashes;
        this.monkey = monkey;
    }

    public boolean getisSherif(){
        return  isSherif;
    }
    public void setisSherif(boolean isSherif){
        this.isSherif = isSherif;
    }

    public int gettrashes(){
        return  trashes;
    }
    public void settrashes(int trashes){
        this.trashes = trashes;
    }

    public boolean getmonkey(){
        return  monkey;
    }
    public void setmonkey(boolean monkey){
        this.monkey = monkey;
    }

    @Override
    public void display(){
        System.out.println("Это полицейский участок)");
    }

    @Override
    public String toString(){
        return super.toString() + "\nЕсть шериф: " + isSherif + "\nкол-во ментов: " + trashes + "\nЕсть обезьянник: " + monkey;
    }
}

