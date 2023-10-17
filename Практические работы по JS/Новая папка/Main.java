public class Main {
    public static void main(String[] args) {
        HighRiseBuilding a = new HighRiseBuilding("Burj Khalifa ",
                "Sheikh Mohammed bin Rashid Blvd - Downtown Dubai - Dubai - ОАЭ",
                2010, "Эдриан Смит", true);
        System.out.println(a.toString());
        a.display();
        a.ladder();
        a.material("All day");

        House x = new House("penis", "seksi", 123, "hiu", true, 123 , 456, false);
        System.out.println(x.toString());
        x.display();
    }

}
