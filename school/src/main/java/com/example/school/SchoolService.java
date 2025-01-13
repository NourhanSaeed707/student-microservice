package com.example.school;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public void save(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
