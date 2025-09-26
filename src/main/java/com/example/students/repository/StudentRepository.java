package com.example.students.repository;

import com.example.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// واجهة توفر CRUD جاهز بدون SQL
public interface StudentRepository extends JpaRepository<Student, Long> {
}
