package com.example.management.service.treatment;

import com.example.management.dto.treatment.TreatmentResponseDTO;
import com.example.management.entity.treatment.Treatment;

import java.util.List;

public interface TreatmentService {

    Treatment create(TreatmentResponseDTO treatmentResponseDTO);

    List<Treatment> getAllTreatment();

}
