package trilha.back.financys.Controllers;

import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Entities.CategoryEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    private List<CategoryEntity> list = new ArrayList<CategoryEntity>();

    @PostMapping
    public List<CategoryEntity> save(@RequestBody CategoryEntity categoryEntity) {
        list.add(categoryEntity);
        return list;
    }

    @GetMapping
    public List<CategoryEntity> CategoryEntity() {
        return list;
    }
}
