public class Main {
    public static void main(String[] args) {
//        HighRiseBuilding a = new HighRiseBuilding("Burj Khalifa ",
//                "Sheikh Mohammed bin Rashid Blvd - Downtown Dubai - Dubai - ОАЭ",
//                2010, "Эдриан Смит", true);
//        System.out.println(a.toString());
//        a.display();
//        a.ladder();
//        a.material("All day");

        House x = new House("erg", "rge", 123, "erg", true, 123 , 456, false);
        System.out.println(x.toString());
        x.display();
        x.floors();

        HighRiseBuilding HR = new HighRiseBuilding("рпа", "4516", 123, "lih", true, false, 2.8, "456");
        System.out.println(HR.toString());
        HR.display();
        HR.floors();
    }

}
