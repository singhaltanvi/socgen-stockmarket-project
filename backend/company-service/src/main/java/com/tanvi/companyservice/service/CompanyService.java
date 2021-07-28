package com.tanvi.companyservice.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.tanvi.companyservice.dto.CompanyDto;
import com.tanvi.companyservice.dto.IpoDto;
import com.tanvi.companyservice.helper.Helper;
import com.tanvi.companyservice.model.Company;
import com.tanvi.companyservice.model.IpoDetails;
import com.tanvi.companyservice.model.StockExchange;
import com.tanvi.companyservice.repository.CompanyRepo;
import com.tanvi.companyservice.repository.StockExchangeRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    @Autowired
    private StockExchangeRepo stockExchangeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public CompanyDto addCompany(CompanyDto companyDto) throws Exception {
        Company company = modelMapper.map(companyDto, Company.class);
        List<String> stockExchangeNamesList = companyDto.getStockExchangeNames();
        if(stockExchangeNamesList!=null) {
            for( String str : stockExchangeNamesList) {
                StockExchange obj = stockExchangeRepo.findByStockExchangeName(str);
                if(obj==null) {
                    throw new Exception("Stock Exchange with name "+ str+ " not exist!!!");
                }
                else {
                    company.addStockExchangeList(obj);
                }
            }
        }
        ;
        CompanyDto dto = modelMapper.map(companyRepo.save(company), CompanyDto.class);
        dto.setStockExchangeNames(companyDto.getStockExchangeNames());
        return dto;
    }

    public CompanyDto findCompanyByName(String companyName) {
        Company obj = companyRepo.findByCompanyName(companyName);
        if(obj==null)
        {
            return null;
        }
        return modelMapper.map(obj, CompanyDto.class);
    }

    public CompanyDto findCompanyById(int companyId) {
        Company obj = companyRepo.findById(companyId).get();
        return modelMapper.map(obj, CompanyDto.class);
    }

    @Transactional
    public void deleteCompanyById(int companyId) {
        Company obj = companyRepo.findById(companyId).get();
        obj.setStockExchangeList(null);
        companyRepo.deleteById(companyId);
    }

    public List<CompanyDto> findAllCompany(){
        Type listType = new TypeToken<List<CompanyDto>>(){}.getType();
        return modelMapper.map(companyRepo.findAll(), listType);
    }

    public List<IpoDto> findIpoDetailsByCompanyId(int companyId){
        Company company = companyRepo.findById(companyId).get();
        List<IpoDetails> ipoDetailsList = company.getIpoList();
        for(IpoDetails ipo : ipoDetailsList) {
            System.out.println(ipo);
        }
        return Helper.IpoDetailsToDto(ipoDetailsList, companyId);

    }

    public List<CompanyDto> findCompanyByPattern(String pattern){
        Type listType = new TypeToken<List<CompanyDto>>(){}.getType();
        return modelMapper.map(companyRepo.findByCompanyNameStartsWith(pattern), listType);
    }
}