package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * New employee
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * pagination query
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * Enable or disable employee account
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * Retrieve employee information by ID
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**Edit employee information
     *
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
