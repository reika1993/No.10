package com.no10;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CatService {
    private final CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }


    public List<Cat> findCat(String name, String sex, Integer age) throws CatNotFoundException {

        if (Objects.nonNull(name)) {
            List<Cat> catsByName = catMapper.findByName(name);
            if (catsByName.isEmpty())
                throw new CatNotFoundException(name + "という名前のねこは存在しません。");
            return catsByName;

        }

        if (Objects.nonNull(sex)) {
            List<Cat> catsBySex = catMapper.findBySex(sex);
            if (catsBySex.isEmpty())
                throw new CatNotFoundException("オスかメスを入力してください.");
            return catsBySex;
        }

        if (Objects.nonNull(age)) {
            List<Cat> catsByAge = catMapper.findByAge(age);
            if (catsByAge.isEmpty())
                throw new CatNotFoundException("現在" + age + "才のねこはいません。");
            return catsByAge;
        }


        return catMapper.findAll();
    }
}
