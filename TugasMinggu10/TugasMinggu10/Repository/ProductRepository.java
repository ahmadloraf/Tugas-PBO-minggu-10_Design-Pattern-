package TugasMinggu10.Repository;

import TugasMinggu10.ObjectPool.DatabasePool;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void insert(Product product){
        DatabasePool.getConnection().sql("insert into products (id, name, price) values (?, ? ,?)",
                product.getId(), product.getName(), product.getPrice());

    }

    public void update(Product product){
        DatabasePool.getConnection().sql("update products set name = ? where id = ?", product.getId(),
                product.getName(), product.getPrice());
    }

    public void delete(String id){
        DatabasePool.getConnection().sql("delete products where id = ?", null, null, null);
    }

    public List<Product> selectAll(){
        List<Object[]> select =  DatabasePool.getConnection().select("select * from products");
        List<Product> products = new ArrayList<>();
        for (Object[] object : select){
            Product product = new Product();
            product.setId((String) object[0]);
            product.setName((String) object[0]);
            product.setPrice((Integer) object[0]);
            products.add(product);
        }
        return products;

    }


}
