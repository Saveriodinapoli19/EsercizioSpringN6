package com.example.EsercizioN6;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnrollments;
    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;

}
