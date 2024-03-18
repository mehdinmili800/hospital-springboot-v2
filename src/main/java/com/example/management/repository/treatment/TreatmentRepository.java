package com.example.management.repository.treatment;

import com.example.management.entity.treatment.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment,Long> {
}
