package TugasMinggu10.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdaptorApp {

    public static void main(String[] args) {
        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new BookCatalogAdapter(new Book("Pemograman Java", "Eko")));
        list.add(new BookCatalogAdapter(new Book("Pemograman PHP", "Kurniawan")));
        list.add(new BookCatalogAdapter(new Book("Pemograman Python", "Khannedy")));

        list.add(new ScreencastCatalogAdaptor(new Screencast("Web Laravel", "Joko", 100L)));
        list.add(new ScreencastCatalogAdaptor(new Screencast("Web Rails", "Rudi", 100L)));
        list.add(new ScreencastCatalogAdaptor(new Screencast("Flask Web", "Ardi", 100L)));

        list.forEach(item ->{
            System.out.println(item.getCatalog());
        });
    }
}
