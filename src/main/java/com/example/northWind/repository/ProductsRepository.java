package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Integer>{
    
}


