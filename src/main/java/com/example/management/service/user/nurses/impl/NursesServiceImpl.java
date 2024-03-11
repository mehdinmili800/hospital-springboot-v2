package com.example.management.service.user.nurses.impl;

import com.example.management.dto.user.NursesResponseDTO;
import com.example.management.entity.user.Authority;
import com.example.management.entity.user.User;
import com.example.management.entity.user.nurses.Nurses;
import com.example.management.repository.user.UserRepository;
import com.example.management.repository.user.nurses.NursesResponse;
import com.example.management.service.user.nurses.NursesService;
import com.example.management.service.user.user.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NursesServiceImpl implements NursesService {

    @Autowired
    private NursesResponse nursesResponse;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityService authorityService;

    @Override
    public List<Nurses> findAll() {
        return nursesResponse.findAll();
    }

    @Override
    public Nurses create(NursesResponseDTO nursesResponseDTO) {
        User user = userRepository.findByUsername(nursesResponseDTO.getUsername())
                .orElseThrow(() -> new NoSuchElementException("User not found with username: "
                + nursesResponseDTO.getNurse_name()));
        Nurses nurses = new Nurses();
        nurses.setNurse_name(nursesResponseDTO.getNurse_name());
        nurses.setNurse_duty_hour(nursesResponseDTO.getNurse_duty_hour());
        nurses.setNurse_mobile(nursesResponseDTO.getNurse_mobile());
        nurses.setNurse_email(nursesResponseDTO.getNurse_email());
        nurses.setNurse_address(nursesResponseDTO.getNurse_address());

        List<Authority> authorities = authorityService.findByName("ROLE_NURSES");
        user.setAuthorities(authorities);

        nurses.setNurses(user);
        nursesResponse.save(nurses);
        return nurses;
    }
}
