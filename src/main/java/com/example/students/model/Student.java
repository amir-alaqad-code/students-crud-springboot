package com.example.students.model;

import jakarta.persistence.*;
import lombok.*;

// كيان يمثل جدول الطلاب
@Entity
@Table(name = "students")
@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // المعرّف

    private String name;    // الاسم
    private String major;   // التخصص
    private Double grade;   // الدرجة
}
