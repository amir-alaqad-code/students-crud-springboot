package com.example.students.controller;

import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Student getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // تعبئة بيانات تجريبية
    @GetMapping("/seed")
    public String seed() {
        if (repo.count() == 0) {
            repo.save(new Student(null, "Ali",  "CS",   90.0));
            repo.save(new Student(null, "Sara", "IT",   85.0));
            repo.save(new Student(null, "Omar", "Math", 95.0));
            return "Seeded 3 students.";
        }
        return "Already seeded.";
    }
}
