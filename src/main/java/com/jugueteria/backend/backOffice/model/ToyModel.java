package com.jugueteria.backend.backOffice.model;

import com.jugueteria.backend.common.base.BaseModel;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class ToyModel extends BaseModel {
    private Long id;
    private String name_toy;
    private String desc_toy;
    private Double price_toy;
}
