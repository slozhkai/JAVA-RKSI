import java.util.Scanner;

public interface SocialHouse {
    Scanner s = new Scanner(System.in);


    default void floors(){
        System.out.println("введите количество этажей: ");
        double v = s.nextDouble();
        double rise = v * 2.8;
        System.out.println("Высота: " + rise);
    }

    boolean ladder();
}
