package com.example.hr.dto;

import com.example.hr.model.Department;
import com.example.hr.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptRequest {

    private Department department;
}
