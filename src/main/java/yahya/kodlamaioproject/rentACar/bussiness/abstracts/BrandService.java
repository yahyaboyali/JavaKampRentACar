package yahya.kodlamaioproject.rentACar.bussiness.abstracts;

import yahya.kodlamaioproject.rentACar.bussiness.requests.CreateBrandRequest;
import yahya.kodlamaioproject.rentACar.bussiness.responses.GetAllBrandREsponse;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandREsponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
