package com.example.management.controller.treatment_controller;

import com.example.management.dto.treatment.TreatmentResponseDTO;
import com.example.management.entity.treatment.Treatment;
import com.example.management.service.treatment.TreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TreatmentController {

    @Autowired
    private TreatmentServiceImpl treatmentService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_DOCTOR')")
    @PostMapping(value = "/treatment/create")
    public Treatment create(@RequestBody TreatmentResponseDTO treatmentResponseDTO){
        return treatmentService.create(treatmentResponseDTO);
    }

    @GetMapping("/treatment/all")
    public ResponseEntity<List<Treatment>> getAllTreatment(){
        List<Treatment> treatments = treatmentService.getAllTreatment();
        return ResponseEntity.ok(treatments);
    }
}
