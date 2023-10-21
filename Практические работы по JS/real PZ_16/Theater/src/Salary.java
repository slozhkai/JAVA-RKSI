import java.util.Objects;
import java.util.Scanner;

public interface Salary {
    Scanner sc = new Scanner(System.in);


    default void salary(){
        System.out.println("Введите должность вашего сотрудника:");
        String a = sc.nextLine();
        if(Objects.equals(a, "Убощик")){
            System.out.println("Зарплата убощика = 15.000руб");
        }
        if(Objects.equals(a, "Программист")){
            System.out.println("Зарплата программиста  = 80.000руб");
        }
        if(Objects.equals(a, "Рофлер")){
            System.out.println("Зарплата рофлера = 100.000руб");
        }

    }


}
