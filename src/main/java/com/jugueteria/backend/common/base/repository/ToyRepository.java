package com.jugueteria.backend.common.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jugueteria.backend.common.entity.Toy;

public interface ToyRepository extends JpaRepository< Toy, Long  > {
    
    Toy findByIdToy(Long id);

}
