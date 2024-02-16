package com.no10;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public List<Cat> findAll() {
        List<Cat> cats = catMapper.findAll();
        return cats;

    }

    public List<Cat> findByName(String name) {
        List<Cat> cats = catMapper.findByName(name);
        if (cats.isEmpty()) {
            throw new CatNotFoundException(name + "という名前のねこは存在しません。");
        }

        return cats;
    }

    public List<Cat> findBySex(String sex) {
        List<Cat> cats = catMapper.findBySex(sex);
        if (cats.isEmpty()) {
            throw new CatNotFoundException("オスかメスを入力してください。");
        }

        return cats;
    }

    public List<Cat> findByAge(int age) {
        List<Cat> cats = catMapper.findByAge(age);
        if (cats.isEmpty()) {
            throw new CatNotFoundException("現在" + age + "才のねこはいません。");
        }
        return cats;
    }


}