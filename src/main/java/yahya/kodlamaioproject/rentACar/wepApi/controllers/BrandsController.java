package yahya.kodlamaioproject.rentACar.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yahya.kodlamaioproject.rentACar.bussiness.abstracts.BrandService;
import yahya.kodlamaioproject.rentACar.bussiness.requests.CreateBrandRequest;
import yahya.kodlamaioproject.rentACar.bussiness.responses.GetAllBrandREsponse;
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
    public List<GetAllBrandREsponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
}
