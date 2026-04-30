package com.jugueteria.backend.backOffice.mapper;


import com.jugueteria.backend.backOffice.model.ToyModel;
import com.jugueteria.backend.common.base.BaseMapper;
import com.jugueteria.backend.common.entity.Toy;

@Mapper(config = MapStructConfig.class)
public interface ToyMapper extends BaseMapper <Toy,ToyModel> {
    
}
