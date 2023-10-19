class Library extends Building {
    private boolean WC;
    private int book;
    private boolean weekands;

    public Library(String title, String address, int year, String name, boolean culture){
        super(title, address, year, name, culture);
        this.WC = WC;
        this.book = book;
        this.weekands = weekands;
    }

    public boolean getWC(){
        return  WC;
    }
     public void setWC(boolean WC){
        this.WC = WC;
    }

    public int getbook(){
        return book;
    }
    public void setbook(int book){
        this.book = book;
    }

    public boolean getweekands(){
        return  weekands;
    }
    public void setweekands(boolean weekands){
        this.weekands = weekands;
    }

    @Override
    public void display(){
        System.out.println("Это библиотека)");
    }

    @Override
    public String toString(){
        return super.toString() + "\nЕсть ли туалетик)): " + WC + "\nКоличество книг: " + book + "\nЕсть ли выходные: " + weekands;
    }
}
