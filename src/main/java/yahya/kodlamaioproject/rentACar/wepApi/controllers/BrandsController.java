package yahya.kodlamaioproject.rentACar.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yahya.kodlamaioproject.rentACar.bussiness.abstracts.BrandService;
import yahya.kodlamaioproject.rentACar.entities.concretes.Brand;

import java.util.List;

@RestController // anatasyon
@RequestMapping("/api/Brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired // git parametrelere bak, uygulamayı tara newlenmiş halini bana ver
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
