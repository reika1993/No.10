package com.no10;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> catsList(
            String name,
            String sex,
            Integer age) throws CatNotFoundException {


        return catService.findCat(name, sex, age);
    }
}
