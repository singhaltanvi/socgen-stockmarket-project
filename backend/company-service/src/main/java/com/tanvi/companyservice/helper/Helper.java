package com.tanvi.companyservice.helper;
import com.tanvi.companyservice.dto.IpoDto;
import com.tanvi.companyservice.model.IpoDetails;

import java.util.ArrayList;
import java.util.List;

public class Helper {

        public static List<IpoDto> IpoDetailsToDto(List<IpoDetails> ipoDetailsList, int companyId) {
            List<IpoDto> dtoList = new ArrayList<>();
            for(IpoDetails ipo : ipoDetailsList) {
                IpoDto dto = new IpoDto();
                dto.setId(ipo.getId());
                dto.setStockExchangeId(ipo.getStockExchangeId());
                dto.setPricePerShare(ipo.getPricePerShare());
                dto.setTotalShare(ipo.getTotalShares());
                dto.setCompanyId(companyId);
                dtoList.add(dto);
            }
            return dtoList;
        }
}

