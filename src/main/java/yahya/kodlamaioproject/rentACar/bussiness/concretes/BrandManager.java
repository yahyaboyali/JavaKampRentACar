package yahya.kodlamaioproject.rentACar.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yahya.kodlamaioproject.rentACar.bussiness.abstracts.BrandService;
import yahya.kodlamaioproject.rentACar.dataAccess.abstracts.BrandRepository;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired //yazmasak da çalışıyormuş
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
