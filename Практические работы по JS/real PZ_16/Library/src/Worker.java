import java.util.Objects;
import java.util.Scanner;

public class Worker implements Salary {
    private boolean isMan;
    private String name;
    private int id;

    public Worker(boolean isMan, String name, int id) {
        this.isMan = isMan;
        this.name = name;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsman() {
        return isMan;
    }

    public void setIsman(boolean isman) {
        this.isMan = isman;
    }

    public void printWorkerInfo() {
        System.out.println("Имя: " + name);
        System.out.println("ID: " + id);
        System.out.println("Пол: " + (isMan ? "Мужской" : "Женский"));
    }

    @Override
    public void Salarys(Scanner sc) {
        System.out.println("Введите должность сотрудника: ");
        String a = sc.nextLine();

        if (Objects.equals(a, "уборщик")) {
            System.out.println("Зарплата уборщика: 25000 руб. + премия 5000 руб");
        } else if (Objects.equals(a, "библиотекарь")) {
            System.out.println("Зарплата библиотекаря: 45000 руб. + премия 8000 руб");
        } else if (Objects.equals(a, "Старший библиотекарь")) {
            System.out.println("Зарплата старшего библиотекаря: 65000 руб. + премия 10000 руб");
        } else if (Objects.equals(a, "библиограф")) {
            System.out.println("Зарплата библиографа: 54000 руб. + премия 8500 руб");
        } else if (Objects.equals(a, "Научный сотрудник")) {
            System.out.println("Зарплата научного сотрудника: 60000 руб. + премия 7500 руб");
        } else {
            System.out.println("Информации нет!");
        }
    }

    @Override
    public String toString() {
        printWorkerInfo();
        Scanner sc = new Scanner(System.in);
        Salarys(sc);
        return "";
    }
}



