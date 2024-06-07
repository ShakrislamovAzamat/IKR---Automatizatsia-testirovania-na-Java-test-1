package Library;

public abstract class LibraryUnit {

    private String inventoryNumber;

    public LibraryUnit(String InventoryNumber){
        this.inventoryNumber = InventoryNumber;
    }

    public String getInventoryNumber(){
        return inventoryNumber;
    }

    public abstract String getAuthor();

    public abstract String print();
}
