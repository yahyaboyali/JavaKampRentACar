package yahya.kodlamaioproject.rentACar.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yahya.kodlamaioproject.rentACar.bussiness.abstracts.BrandService;
import yahya.kodlamaioproject.rentACar.bussiness.requests.CreateBrandRequest;
import yahya.kodlamaioproject.rentACar.bussiness.responses.GetAllBrandREsponse;
import yahya.kodlamaioproject.rentACar.dataAccess.abstracts.BrandRepository;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired //yazmasak da çalışıyormuş
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandREsponse> getAll() {
        List<Brand> result = brandRepository.findAll();
        List<GetAllBrandREsponse> brandREsponses = new ArrayList<>();
        for (Brand resultBrand: result) {
            GetAllBrandREsponse getAllBrandREsponse = new GetAllBrandREsponse();
            getAllBrandREsponse.setName(resultBrand.getName());
            getAllBrandREsponse.setId(resultBrand.getId());
            brandREsponses.add(getAllBrandREsponse);
        }
        return brandREsponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
