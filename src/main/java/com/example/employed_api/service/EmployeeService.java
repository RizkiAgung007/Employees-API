package com.example.employed_api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employed_api.model.ApiResponse;
import com.example.employed_api.model.WrapResponse;

@Service
public class EmployeeService {
        private final String API_URL = "https://dummy.restapiexample.com/api/v1/employees";

        public WrapResponse getAllEmployees() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<ApiResponse> response = restTemplate.getForEntity(API_URL, ApiResponse.class);
            if (response.getStatusCode().is2xxSuccessful()) {
                return new WrapResponse("Success: Retrieved employees", response.getBody().getData());
            } else {
                return new WrapResponse("Error: Failed to retrieve employees", null);
            }
        } catch (Exception e) {
            return new WrapResponse("Exception: " + e.getMessage(), null);
        }
    }
}

