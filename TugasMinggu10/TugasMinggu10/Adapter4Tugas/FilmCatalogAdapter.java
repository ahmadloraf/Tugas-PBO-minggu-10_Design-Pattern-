package TugasMinggu10.Adapter4Tugas;

public class FilmCatalogAdapter implements CatalogAdapter{

    private Film film;

    public FilmCatalogAdapter(Film film) {
        this.film = film;
    }

    @Override
    public String getCatalogs() {
        return "(Film) " + film.getTitle() + ". Genre : " + film.getGenre();
    }
}
