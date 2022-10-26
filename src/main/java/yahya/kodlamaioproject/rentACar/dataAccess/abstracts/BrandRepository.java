package yahya.kodlamaioproject.rentACar.dataAccess.abstracts;

import org.springframework.stereotype.Repository;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
