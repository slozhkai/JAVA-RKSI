public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;


    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        setName(name);
        setColor(color);
        setPrice(price);
        setLength(length);
        setDraw(draw);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String name){
        this.color = color;
    }



    /*public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }*/

    public void display() {
        System.out.println("Название: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Длина: " + length);
        System.out.println("Цена: " + price);
        System.out.println("Умеет рисовать: " + draw);

    }

    public void replace_rod(String colorRod) {
        color = colorRod;
    }

    public void priceUp(int up) {
        price = (price + up);
    }

    public void priceDown(int down) {
        price = (price - down);
    }

    public void draw() {
        if (draw == true) {
            System.out.print(name + " провел линию. \nЕё цвет " + color + "\n \n");
        } else {
            System.out.print(name + " не может провести линию.");
        }
    }

    /*WritingMaterials(String n, String c){
        name = n;
        color = c;
    }
    WritingMaterials(String n, int p){
        name = n;
        color = "No color";
        price = p;
    }
    WritingMaterials(int p, double l, boolean d){
        name = "No name";
        color = "No color";
        price = p;
        length = l;
        draw = d;
    }
    WritingMaterials(String n, String c, int p, double l, boolean d){
        name = n;
        color = c;
        price = p;
        length = l;
        draw = d;
    }*/
}
