import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Person person = new Person("Виталий", "Павлов");
        //Library x = new Library("Государственная библиотека", "ул. Большая Садовая ", 12312, "Самая большая библиотека в мииире!", Library.isOnline());

        //Event x = new Event("Государственная библиотека", "ул. Большая Садовая ", 1964, "Самая большая библиотека в мииире!", Library.isOnline(), "Золотой век русской литературы", "Читаем и кайфуем", "25 Октября 14:00");

        //Writer x = new Writer("Государственная библиотека", "ул. Большая Садовая ", 1964, "Самая большая библиотека в мииире!", Library.isOnline(), person, "25.03.1979", "-" );

        //ReadingClub x = new ReadingClub("Государственная библиотека", "ул. Большая Садовая ", 1964, "Самая большая библиотека в мииире!", Library.isOnline(), "Олег, Игорь, Даниил, Василий", "no smoke, no drink, no fun", "базы данных, интернет, журналы");
        //System.out.println(x.toString());
        //x.display();

        // List<Book> books = new ArrayList<>();
        // books.add(new Book("English", 2005, "To Kill a Mockingbird"));
        // books.add(new Book("French", 1862, "Les Misérables"));
        // books.add(new Book("German", 1925, "The Great Gatsby"));
        // books.add(new Book("Spanish", 1985, "One Hundred Years of Solitude"));
        // books.add(new Book("Russian", 1866, "Crime and Punishment"));
        // books.add(new Book("Italian", 1304, "The Divine Comedy"));
        // books.add(new Book("Chinese", 1590, "Journey to the West"));
        // books.add(new Book("Japanese", 1949, "Ningen Shikkaku"));
        // books.add(new Book("Korean", 1917, "The Soil"));
        // books.add(new Book("Arabic", 1959, "Season of Migration to the North"));

        // for (Book book : books) {
        //     book.print();
        //     System.out.println("-----------");
        // }


        
        //List<Worker> workers = new ArrayList<>();
        //workers.add(new Worker("Library Manager", true, "John Doe"));
        // workers.add(new Worker("Librarian", false, "Jane Smith"));
        // workers.add(new Worker("Cataloguer", true, "Michael Johnson"));

        //for (Worker worker : workers) {
        //     System.out.println("Position: " + worker.getPosition());
        //     System.out.println("Is male: " + worker.isIsman());
        //     System.out.println("Name: " + worker.getName());
        //     System.out.println("-----------");
        // }

//        List<Client> clients = new ArrayList<>();
//
//        clients.add(new Client(new Person("Alice", "Smith"), false, 1));
//        clients.add(new Client(new Person("Bob", "Johnson"), true, 2));
//        clients.add(new Client(new Person("Eve", "Williams"), true, 3));
//
//        for (Client client : clients) {
//            System.out.println("Name: " + client.getPerson().getName());
//            System.out.println("Surname: " + client.getPerson().getSurname());
//            System.out.println("Has Debts: " + client.isIsdebts());
//            System.out.println("ID: " + client.getId());
//            System.out.println("-----------");
//        }
        Worker x = new Worker(true, "John Doe", 1);
        System.out.println(x.toString());

    }
}