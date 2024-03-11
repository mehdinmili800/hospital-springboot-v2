package com.example.management.service.user.nurses;

import com.example.management.dto.user.NursesResponseDTO;
import com.example.management.entity.user.nurses.Nurses;

import java.util.List;

public interface NursesService {

    List<Nurses> findAll();

    Nurses create(NursesResponseDTO nursesResponseDTO);
}
