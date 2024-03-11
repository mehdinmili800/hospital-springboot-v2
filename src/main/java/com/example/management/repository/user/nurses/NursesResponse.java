package com.example.management.repository.user.nurses;

import com.example.management.entity.user.nurses.Nurses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NursesResponse extends JpaRepository<Nurses,Long> {
}
