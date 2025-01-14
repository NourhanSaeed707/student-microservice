package com.example.school;
import com.example.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void save(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
         var school = schoolRepository.findById(schoolId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "School not found"));
         var students = studentClient.findAllStudentsBySchool(schoolId);
         return FullSchoolResponse.builder()
                 .students(students)
                 .email(school.getEmail())
                 .name(school.getName())
                 .build();
    }
}
