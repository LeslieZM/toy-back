package com.jugueteria.backend.backOffice.service;

import java.util.List;
import com.jugueteria.backend.backOffice.model.ToyModel;

public interface ToyService {
    
    List<ToyModel> findAll();
}
