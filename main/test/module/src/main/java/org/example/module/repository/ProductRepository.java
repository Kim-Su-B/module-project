package org.example.module.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.module.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}