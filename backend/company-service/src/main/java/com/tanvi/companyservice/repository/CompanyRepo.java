package com.tanvi.companyservice.repository;

import java.util.List;

import com.tanvi.companyservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer>{
    public Company findByCompanyName(String companyName);

    public List<Company> findByCompanyNameStartsWith(String pattern);
}
