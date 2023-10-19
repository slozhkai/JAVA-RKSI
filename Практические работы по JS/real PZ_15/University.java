class University extends Building {
    private boolean isObshyaga;
    private int students;
    private String napravlenie;
    public University(String title, String address, int year, String name, boolean culture){
        super(title, address, year, name, culture);
        this.isObshyaga = isObshyaga;
        this.students = students;
        this.napravlenie = napravlenie;
    }

    public boolean getisObshyaga(){
        return  isObshyaga;
    }
    public void setisObshyaga(boolean floors){
        this.isObshyaga = isObshyaga;
    }

    public int getStudents(){
        return  students;
    }
    public void setStudents(int students){
        this.students = students;
    }

    public String getNapravlenie(){
        return  napravlenie;
    }
    public void setNapravlenie(String napravlenie){
        this.napravlenie = napravlenie;
    }
    @Override
    public void display(){
        System.out.println("Это университет)");
    }

    @Override
    public String toString(){
        return super.toString() + "\nЕсть общага: " + isObshyaga + "\nкол-во студентов: " + students + "\nНаправление: " + napravlenie;
    }
}
