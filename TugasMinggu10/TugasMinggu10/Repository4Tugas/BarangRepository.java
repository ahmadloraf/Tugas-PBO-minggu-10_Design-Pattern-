package TugasMinggu10.Repository4Tugas;

import TugasMinggu10.ObjectPool.DatabasePool;

import java.util.ArrayList;
import java.util.List;

public class BarangRepository {
    public void insert(Barang barang){
        DatabasePool.getConnection().sql("insert into tbl_barang (id, nama, harga) values (?, ? ,?)",
                barang.getId(), barang.getNama(), barang.getHarga());

    }

    public void update(Barang barang){
        DatabasePool.getConnection().sql("update tbl_barang set name = ? where id = ?", barang.getId(),
                barang.getNama(), barang.getHarga());
    }

    public void delete(String id){
        DatabasePool.getConnection().sql("delete tbl_barang where id = ?", null, null, null);
    }

    public List<Barang> selectAll(){
        List<Object[]> select =  DatabasePool.getConnection().select("select * from tbl_barang");
        List<Barang> barangs = new ArrayList<>();
        for (Object[] object : select){
            Barang barang = new Barang();
            barang.setId((String) object[0]);
            barang.setNama((String) object[0]);
            barang.setHarga((Integer) object[0]);
            barangs.add(barang);
        }
        return barangs;

    }
}
