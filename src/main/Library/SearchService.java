package Library;

import java.util.List;

public interface SearchService {

    LibraryUnit findByInventoryNumber(String inventoryNumber);
    List<LibraryUnit> findByAuthor(String author);
}
