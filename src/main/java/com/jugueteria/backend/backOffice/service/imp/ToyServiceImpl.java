package com.jugueteria.backend.backOffice.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jugueteria.backend.backOffice.mapper.ToyMapper;
import com.jugueteria.backend.backOffice.model.ToyModel;
import com.jugueteria.backend.backOffice.service.ToyService;
import com.jugueteria.backend.common.base.repository.ToyRepository;

@Service
public class ToyServiceImpl implements ToyService {

    @Autowired
    ToyMapper toyMapper;
    
    @Autowired
    ToyRepository toyRepo; 

    @Override
    public List<ToyModel> findAll() {
        return null;
        
    }

    
}