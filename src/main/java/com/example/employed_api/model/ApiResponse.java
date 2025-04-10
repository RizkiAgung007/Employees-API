package com.example.employed_api.model;

import java.util.List;

public class ApiResponse {
    private String status;
    private List<Employe> data;

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<Employe> getData() { return data; }
    public void setData(List<Employe> data) { this.data = data; }    
}
