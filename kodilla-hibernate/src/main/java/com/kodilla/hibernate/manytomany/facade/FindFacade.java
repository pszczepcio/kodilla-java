package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class FindFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompany(String companyName){
        List<Company> companyList = companyDao.findBySequenceOfCharacters(companyName);
        return companyList;
    }

    public List<Employee> findEmployee(String employeeName){
        List<Employee> employeeList = employeeDao.findBySequenceOfCharacters(employeeName);
        return employeeList;
    }

}
