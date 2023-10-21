import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Показывает старый или новый театр, устанавливает и добавляет возраст
//       Theatre th = new Theatre("Театр", "Стачки 2023", 1996, "им. Максима Горького", true, "Драматический");
//       System.out.println(th.toString());
//       th.display();
//       th.age();
//       th.addAge(100);
//       System.out.println(th.toString());
//       th.age();
//       th.setAge(100);
//       System.out.println(th.toString());
//       th.age();


//        MainHall mh = new MainHall("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 3, 21, true);
//        mh.display();
//        System.out.println(mh.toString());


//        Amphitheater at = new Amphitheater("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 20.5, true, true);
//        at.display();
//        System.out.println(at.toString());


//        Parterre pt = new Parterre("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 250, true, true);
//        pt.display();
//        System.out.println(pt.toString());


//        Balcony bl = new Balcony("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 10.5, true, 20.0);
//        bl.height();
//        bl.display();
//        System.out.println(bl.toString());


//        Mezzanine mz = new Mezzanine("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 3, true, 5);
//        mz.display();
//        System.out.println(mz.toString());


//        Toilet tl = new Toilet("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 5, true, 3, true);
//        tl.display();
//        System.out.println(tl.toString());


//        Wardrobe wd = new Wardrobe("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", 1000, 30, "8.00 - 22.00");
//        wd.display();
//        System.out.println(wd.toString());


//        Tickets tc = new Tickets("Театр", "Стачки 2023", 1996, "им. Максима Горького",
//                true, "Драматический", "Ромео и Джульетта", "10.10.2023", Tickets.cost, Tickets.add);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите сколько билетов хотите купить: ");
//        double a = sc.nextDouble();
//
//        if(a <= 0){
//            System.out.println("Некорректно");
//        }
//        else{
//            Tickets.addTicket(a);
//        }
//        tc.display();
//        System.out.println(tc.toString());


//        Scanner sc = new Scanner(System.in);
//        EmployeeList emplst = new EmployeeList();
//
//        Employee employee1 = new Employee(1, "Клименко Олег Юрьевич", "Рофлер");
//        Employee employee2 = new Employee(2, "Сапонджян Хачатур Самвелович", "Уборщик");
//        Employee employee3 = new Employee(3, "Костин Данил Геогриевич", "Программист");
//
//        emplst.salary();
//        System.out.println("Вот наши сотрудники:");
//        emplst.addEmployee(employee1);
//        emplst.addEmployee(employee2);
//        emplst.addEmployee(employee3);
//
//        // Получение списка сотрудников
//        List<Employee> employees = emplst.getEmployees();
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//
//        System.out.println("\nВведите id вашего сотрудника: ");
//        int a = sc.nextInt();
//        Employee foundEmployee = emplst.getEmployeeById(a);
//        if (foundEmployee != null) {
//            System.out.println("Найден сотрудник: " + foundEmployee);
//        } else {
//            System.out.println("Сотрудник с идентификатором " + a + " не найден.");
//        }
    }
}
