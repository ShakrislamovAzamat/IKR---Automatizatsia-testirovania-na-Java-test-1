package Library;

import java.util.List;

public class LibraryRegistry {

    private List<LibraryUnit> units;

    public LibraryRegistry(List<LibraryUnit> units){
        this.units = units;
    }
    public List<LibraryUnit> getUnits(){
        return units;
    }
}
