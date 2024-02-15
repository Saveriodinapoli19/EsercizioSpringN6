package com.example.EsercizioN6.Repo;

import com.example.EsercizioN6.Enrollments;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentsRepository extends JpaRepository<Enrollments, Long> {
}
