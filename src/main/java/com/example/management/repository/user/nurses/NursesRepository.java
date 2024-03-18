package com.example.management.repository.user.nurses;

import com.example.management.entity.user.User;
import com.example.management.entity.user.nurses.Nurses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NursesRepository extends JpaRepository<Nurses,Long> {

    Optional<Nurses> findByNurseName(String nurseName);
}
