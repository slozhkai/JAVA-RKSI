import java.util.Scanner;
public interface LivingHouse {
    Scanner s = new Scanner(System.in);
    void setToilets(int toilets);

    default void floors(){
        System.out.println("введите кол-во этажей: ");
        int a = s.nextInt();
        System.out.println(a);
    }
    boolean podval();
}