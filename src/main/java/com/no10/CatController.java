package com.no10;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@Validated
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> getCat(@RequestParam(required = false) String name,
                            @RequestParam(required = false) String sex,
                            @RequestParam(required = false) Integer age) throws CatNotFoundException {
        if ((Objects.nonNull(name) && ((Objects.nonNull(sex)) || (Objects.nonNull(age)))) ||
                (Objects.nonNull(sex) && ((Objects.nonNull(name)) || (Objects.nonNull(age)))) ||
                ((Objects.nonNull(age) && ((Objects.nonNull(name)) || (Objects.nonNull(sex)))))) {
            throw new CatNotFoundException("一度に許可されるパラメタはひとつだけです。");
        }

        return catService.findCat(name, sex, age);
    }

}
