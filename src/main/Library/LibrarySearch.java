package Library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySearch implements PrintService, SearchService{

    private LibraryRegistry registry;

    public LibrarySearch(LibraryRegistry registry){
        this.registry = registry;
    }


    @Override
    public void printByInventoryNumber(LibraryUnit unit) {
        System.out.printf("Найдено: Инвентарный номер: %s, %s", unit.getInventoryNumber(), unit.print());
    }

    @Override
    public void printByAuthor(List<LibraryUnit> units) {
        for (LibraryUnit unit : units) {
            System.out.printf("Найдено: Инвентарный номер: %s, %s", unit.getInventoryNumber(), unit.print());
        }
    }

    @Override
    public LibraryUnit findByInventoryNumber(String inventoryNumber) {
        for(LibraryUnit unit : registry.getUnits()) {
            if (unit.getInventoryNumber().equals(inventoryNumber)) {
                return unit;
            }
        }
        return null;
    }

    @Override
    public List<LibraryUnit> findByAuthor(String author) {
        List<LibraryUnit> result = new ArrayList<>();
        for (LibraryUnit unit : registry.getUnits()) {
            if (unit.getAuthor().contains(author)) {
                result.add(unit);
            }
        }
        return result;
    }
}
