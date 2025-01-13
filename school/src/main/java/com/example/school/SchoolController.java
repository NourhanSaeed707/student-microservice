package com.example.school;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v2/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school) {
        schoolService.save(school);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<School> findAll() {
        return schoolService.findAll();
    }
}
