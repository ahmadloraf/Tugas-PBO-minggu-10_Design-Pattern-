package TugasMinggu10.Adapter4Tugas;

import java.util.ArrayList;
import java.util.List;

public class AdaptorApp {
    public static void main(String[] args) {
        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new FilmCatalogAdapter(new Film("Godzilla", "Romance")));
        list.add(new FilmCatalogAdapter(new Film("Godzilla", "Romance")));
        list.add(new FilmCatalogAdapter(new Film("Godzilla", "Romance")));

        list.add(new SeriesCatalogAdapter(new Series("idk", "idk too", 12)));
        list.add(new SeriesCatalogAdapter(new Series("idk", "idk too", 12)));
        list.add(new SeriesCatalogAdapter(new Series("idk", "idk too", 12)));

        list.forEach(item ->{
            System.out.println(item.getCatalogs());
        });

//        list.forEach(item ->{
//            if(item instanceof Film){
//                Film film = new Film();
//                System.out.println(film.getTitle() + ". Genre : " + film.getGenre());
//            }else if(item instanceof Series){
//                Series series = new Series();
//                System.out.println(series.getJudul_series() + ". Genre : " + series.getGenre());
//            }
//        });
    }
}
