import Library.*;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {

        List<LibraryUnit> units = new ArrayList<>();
        units.add(new Book("1001", "Пушкин Александр Сергеевич", "Евгений Онегин"));
        units.add(new Book("1002", "Пушкин Александр Сергеевич", "Сказка о рыбаке и рыбке"));
        units.add(new Book("1003", "Толстой Лев Николаевич", "Война и Мир"));
        units.add(new Book("1004", "Есенин Сергей Александрович", "Исповедь хулигана"));
        units.add(new Newspaper("5001", "Янаульские зори", 0124));
        units.add(new Newspaper("5002", "Янаульские зори", 0224));
        units.add(new Newspaper("5003", "Янаульские зори", 0324));
        units.add(new Newspaper("5004", "Янаульские зори", 0424));
        units.add(new Magazine("3001", "Наука", "Наука и жизнь", 1));
        units.add(new Magazine("3002", "Наука", "Наука и жизнь", 6));


        LibraryRegistry registry = new LibraryRegistry(units);
        LibrarySearch librarySearch = new LibrarySearch(registry);

        List<LibraryUnit> unitsByAuthor = librarySearch.findByAuthor("Янаул");
        librarySearch.printByAuthor(unitsByAuthor);

        LibraryUnit unit = librarySearch.findByInventoryNumber("3002");
        librarySearch.printByInventoryNumber(unit);

        List<LibraryUnit> unitsByAuthor2 = librarySearch.findByAuthor("Пушкин");
        librarySearch.printByAuthor(unitsByAuthor2);
    }
}
