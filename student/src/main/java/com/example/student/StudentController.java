package com.example.student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Student> findAll() {
        return studentService.findAll();
    }
}