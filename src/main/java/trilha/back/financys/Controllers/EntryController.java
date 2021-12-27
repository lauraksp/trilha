package trilha.back.financys.Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Entities.EntryEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Lancamentos")
@CrossOrigin(origins="*")
public class EntryController {

    private List<EntryEntity> list = new ArrayList<EntryEntity>();

    @PostMapping("/lancamentos")
        @ApiOperation(value="Retorna uma lista unica")
    public int save(@RequestBody EntryEntity entryEntity) {
        list.add(entryEntity);
        return list.size();
    }

    @GetMapping("/lancamentos")
        @ApiOperation(value="Retorna uma lista ordenada por data")
    public List<EntryEntity> entryEntities() {
        list.sort((d1, d2) -> d1.getDate().compareTo(d2.getDate()));
        return list;
    }
}
