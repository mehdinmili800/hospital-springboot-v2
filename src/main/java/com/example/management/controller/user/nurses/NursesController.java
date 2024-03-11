package com.example.management.controller.user.nurses;

import com.example.management.dto.user.NursesResponseDTO;
import com.example.management.entity.user.nurses.Nurses;
import com.example.management.service.user.nurses.impl.NursesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NursesController {

    @Autowired
    private NursesServiceImpl nursesService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_DOCTOR')")
    @PostMapping(value = "/nurses/create")
    public Nurses create(@RequestBody NursesResponseDTO nursesResponseDTO){
        return nursesService.create(nursesResponseDTO);
    }

    @GetMapping(value = "/nurses/all")
    public List<Nurses> findAll(){
        return nursesService.findAll();
    }
}
