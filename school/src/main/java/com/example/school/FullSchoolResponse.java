package com.example.school;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullSchoolResponse {
    private String name;
    private String email;
    List<Student> students;
}
