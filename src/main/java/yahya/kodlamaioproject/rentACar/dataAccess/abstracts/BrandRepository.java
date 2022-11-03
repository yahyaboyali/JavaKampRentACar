package yahya.kodlamaioproject.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
