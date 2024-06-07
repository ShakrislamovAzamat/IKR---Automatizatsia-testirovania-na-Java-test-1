package Library;

public class Magazine extends LibraryUnit{

    private String category;
    private String publisher;
    private int publicationNumber;

    public Magazine(String inventoryNumber, String category, String publisher, int publicationNumber){
        super(inventoryNumber);
        this.category = category;
        this.publisher = publisher;
        this.publicationNumber = publicationNumber;
    }


    @Override
    public String getAuthor() {
        return publisher;
    }

    @Override
    public String print() {
        return "Тип: ЖУРНАЛ, Категория: " + category + ", Издание: " + publisher + ", Номер издания: " + publicationNumber + "\n";
    }
}
