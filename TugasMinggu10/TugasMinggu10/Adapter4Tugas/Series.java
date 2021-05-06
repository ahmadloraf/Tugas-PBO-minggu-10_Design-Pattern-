package TugasMinggu10.Adapter4Tugas;

public class Series {
    private String judul_series;
    private String genre;
    private Integer total_eps;

    public Series(String judul_series, String genre, Integer total_eps) {
        this.judul_series = judul_series;
        this.genre = genre;
        this.total_eps = total_eps;
    }

    public String getJudul_series() {
        return judul_series;
    }

    public void setJudul_series(String judul_series) {
        this.judul_series = judul_series;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getTotal_eps() {
        return total_eps;
    }

    public void setTotal_eps(Integer total_eps) {
        this.total_eps = total_eps;
    }
}
