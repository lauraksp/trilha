import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/category")
@RestController
public class CategoryController {

    private List<CategoryEntity> list = new ArrayList<CategoryEntity>();

    @PostMapping
    public int save(@RequestBody CategoryEntity categoryEntity) {
        list.add(categoryEntity);
        return list.size();

    }

    @GetMapping
    public int CategoryEntity() {
        return list.size();
    }
}
