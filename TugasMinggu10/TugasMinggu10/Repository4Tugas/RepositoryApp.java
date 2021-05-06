package TugasMinggu10.Repository4Tugas;

import java.util.List;

public class RepositoryApp {
    public static void main(String[] args) {
        Barang barang = new Barang();
        barang.setId("1");
        barang.setNama("Barang 1");
        barang.setHarga(100000);

        BarangRepository repository = new BarangRepository();
        repository.insert(barang);

        barang.setHarga(150000);

        repository.update(barang);

        repository.delete(barang.getId());

        List<Barang> barangs = repository.selectAll();



    }
}
