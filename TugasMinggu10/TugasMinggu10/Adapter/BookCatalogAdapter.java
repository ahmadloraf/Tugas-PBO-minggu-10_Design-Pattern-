package TugasMinggu10.Adapter;

public class BookCatalogAdapter implements CatalogAdapter{

    private Book book;

    public BookCatalogAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getCatalog() {
        return "(Book)" + book.getTitle() + " by " + book.getAuthor();
    }
}
