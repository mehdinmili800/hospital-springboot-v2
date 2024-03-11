package com.example.management.repository.medicines;

import com.example.management.entity.medicines.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinesRepository extends JpaRepository<Medicines,Long> {
}
