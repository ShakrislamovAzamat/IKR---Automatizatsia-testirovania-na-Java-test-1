package Library;

public class Newspaper extends LibraryUnit{

    private String publisher;
    private int publicationNumber;

    public Newspaper(String inventoryNumber, String publisher, int publicationNumber){
        super(inventoryNumber);
        this.publisher = publisher;
        this.publicationNumber = publicationNumber;
    }


    @Override
    public String getAuthor() {
        return publisher;
    }

    @Override
    public String print() {
        return "Тип: ГАЗЕТА, Издание: " + publisher + ", Номер издания: " + publicationNumber + "\n";
    }
}
