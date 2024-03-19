package com.example.management.service.appointmnent.impl;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.dto.user.DoctorResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.hospital.Hospital;
import com.example.management.entity.user.User;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.entity.user.nurses.Nurses;
import com.example.management.entity.user.patient.Patient;
import com.example.management.repository.appointment.AppointmentRepository;
import com.example.management.repository.hospital.HospitalRepository;
import com.example.management.repository.user.UserRepository;
import com.example.management.repository.user.doctor.DoctorRepository;
import com.example.management.repository.user.nurses.NursesRepository;
import com.example.management.repository.user.patient.PatientRepository;
import com.example.management.service.appointmnent.AppointmentService;
import com.example.management.service.user.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private NursesRepository nursesRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private HospitalRepository hospitalRepository;



    @Override
    public Appointment create(AppointmentResponseDTO appointmentResponseDTO) {
        String appointmentNumber = appointmentResponseDTO.getAppointmentNumber();
        String appointmentType = appointmentResponseDTO.getAppointmentType();
        String appointmentDate = appointmentResponseDTO.getAppointmentDate();
        String appointmentDescription = appointmentResponseDTO.getAppointmentDescription();
        String username = appointmentResponseDTO.getDoctorName();
        String nurseName = appointmentResponseDTO.getNurseName();
        String patientName = appointmentResponseDTO.getPatientName();
        String hospitalName = appointmentResponseDTO.getHospitalName();

        // البحث عن الطبيب باستخدام الهوية
        Optional<Doctor> doctorOptional = doctorRepository.findByDoctorName(username);
        if (!doctorOptional.isPresent()) {
            // إذا لم يتم العثور على الطبيب، يمكنك تنفيذ الإجراء المناسب هنا
            // مثلاً، رمي استثناء أو إرجاع قيمة افتراضية أو إرسال رسالة خطأ
            throw new RuntimeException("Doctor not found with id: " + username);
        }

        Optional<Nurses> nursesOptional = nursesRepository.findByNurseName(nurseName);
        if (!nursesOptional.isPresent()){
            throw new RuntimeException("Nurse not found with id: " + nurseName);
        }

        Optional<Patient> patientOptional = patientRepository.findByPatientName(patientName);
        if (!patientOptional.isPresent()){
            throw new RuntimeException("Patient not found with id: " + patientName);
        }

        Optional<Hospital> hosptialOptional = hospitalRepository.findByHospitalName(hospitalName);
        if (!hosptialOptional.isPresent()){
            throw new RuntimeException("Hospital not found with id: " + hospitalName);
        }


        // الحصول على كائن الطبيب
        Doctor doctor = doctorOptional.get();

        Nurses nurses = nursesOptional.get();

        Patient patient = patientOptional.get();

        Hospital hospital = hosptialOptional.get();

        // إنشاء كائن الموعد
        Appointment appointment = new Appointment(appointmentNumber, appointmentType,
                appointmentDate, appointmentDescription, doctor,nurses,patient,hospital);

        // حفظ الموعد في قاعدة البيانات
        return appointmentRepository.save(appointment);
    }


    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }


    @Override
    public List<Appointment> getAppointmentsByDoctorId(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

}
