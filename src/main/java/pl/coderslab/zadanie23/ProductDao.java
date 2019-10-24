package pl.coderslab.zadanie23;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {
    private List<Product> list = new ArrayList<>();

    public ProductDao() {
      list.add(new Product(1l,"Papryka",3));
      list.add(new Product(2l,"Sałata", 3));
      list.add(new Product(3l,"Pomidor", 1));
      list.add(new Product(4l,"Ogórek", 3));
    }

    public List<Product> getList() {
        return list;
    }



}
