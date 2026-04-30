package com.jugueteria.backend.backOffice.service.imp;

import java.util.List;

import com.jugueteria.backend.backOffice.mapper.ToyMapper;
import com.jugueteria.backend.backOffice.model.ToyModel;
import com.jugueteria.backend.backOffice.service.ToyService;
import com.jugueteria.backend.common.base.repository.ToyRepository;

public class ToyServiceImpl implements ToyService {

    ToyMapper toyMapper;
    ToyRepository toyRepo; 

    @Override
    public List<ToyModel> getAllToys() {
     
    return null; 
        
    }

    
}