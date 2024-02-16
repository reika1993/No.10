package com.no10;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
@Validated
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> findCatName(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String sex) throws CatNotFoundException {
        if (name != null) {
            return catService.findByName(name);
        }
        if (sex != null) {
            return catService.findBySex(sex);
        }
        return catService.findAll();
    }


    @GetMapping("/cats/{age}")
    public List<Cat> findCatAge(@PathVariable("age") int age) {
        return catService.findByAge(age);
    }


    @ExceptionHandler({CatNotFoundException.class})
    public ResponseEntity<Map<String, String>> handleCatNotFoundException(
            CatNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}