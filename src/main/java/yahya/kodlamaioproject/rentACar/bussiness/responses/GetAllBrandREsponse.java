package yahya.kodlamaioproject.rentACar.bussiness.responses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandREsponse {
    private int id;
    private String name;
}
