package TugasMinggu10.Adapter4Tugas;

public class SeriesCatalogAdapter implements CatalogAdapter{

    private Series series;

    public SeriesCatalogAdapter(Series series) {
        this.series = series;
    }

    @Override
    public String getCatalogs() {
        return "(Series) " + series.getJudul_series() + ". Genre : " + series.getGenre() + ". Total Episode : "
                + series.getTotal_eps();
    }
}
