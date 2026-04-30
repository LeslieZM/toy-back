package com.jugueteria.backend.common.config;

import org.mapstruct.MapperConfig;

@MapperConfig(
    componentModel = "spring",
    unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface MapStructConfig {
    
}
