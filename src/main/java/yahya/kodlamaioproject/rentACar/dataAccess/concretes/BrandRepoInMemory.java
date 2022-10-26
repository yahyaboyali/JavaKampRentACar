package yahya.kodlamaioproject.rentACar.dataAccess.concretes;

import org.springframework.stereotype.Repository;
import yahya.kodlamaioproject.rentACar.dataAccess.abstracts.BrandRepository;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandRepoInMemory implements BrandRepository {
    List<Brand> brands;

    public BrandRepoInMemory() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"bmw"));
        brands.add(new Brand(2,"audi"));
        brands.add(new Brand(3,"sdsdsdsd"));
    }
    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
