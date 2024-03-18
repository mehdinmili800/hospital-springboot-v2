package com.example.management.service.treatment;

import com.example.management.dto.treatment.TreatmentResponseDTO;
import com.example.management.entity.medicines.Medicines;
import com.example.management.entity.treatment.Treatment;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.entity.user.patient.Patient;
import com.example.management.repository.medicines.MedicinesRepository;
import com.example.management.repository.treatment.TreatmentRepository;
import com.example.management.repository.user.doctor.DoctorRepository;
import com.example.management.repository.user.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedicinesRepository medicinesRepository;



    @Override
    public Treatment create(TreatmentResponseDTO treatmentResponseDTO) {
        String treatmentName = treatmentResponseDTO.getTreatmentName();
        String treatmentNumber = treatmentResponseDTO.getTreatmentNumber();
        String treatmentType = treatmentResponseDTO.getTreatmentType();
        String treatmentDate = treatmentResponseDTO.getTreatmentDate();
        String treatmentDescription = treatmentResponseDTO.getTreatmentDescription();

        String doctorName = treatmentResponseDTO.getDoctorName();
        String patientName = treatmentResponseDTO.getPatientName();
        String medicineName = treatmentResponseDTO.getMedicineName();

        Optional<Doctor> doctorOptional = doctorRepository.findByDoctorName(doctorName);
        if (!doctorOptional.isPresent()){
            throw new RuntimeException("Doctor not found with id: " + doctorName);
        }

        Optional<Patient> patientOptional = patientRepository.findByPatientName(patientName);
        if (!doctorOptional.isPresent()){
            throw new RuntimeException("Patient not found with id: " + patientName);
        }

        Optional<Medicines> medicinesOptional = medicinesRepository.findByMedicineName(medicineName);
        if (!medicinesOptional.isPresent()){
            throw  new RuntimeException("Medicines not found with id: " + medicineName);
        }

        Doctor doctor = doctorOptional.get();
        Patient patient = patientOptional.get();
        Medicines medicines = medicinesOptional.get();

        Treatment treatment = new Treatment(treatmentName,treatmentNumber,treatmentType,
                treatmentDate,treatmentDescription,doctor,patient,medicines);

        return treatmentRepository.save(treatment);
    }

    @Override
    public List<Treatment> getAllTreatment() {
        return treatmentRepository.findAll();
    }
}
