package Library;

import java.util.List;

public interface PrintService {

    void printByInventoryNumber(LibraryUnit unit);
    void printByAuthor(List<LibraryUnit> units);

}
