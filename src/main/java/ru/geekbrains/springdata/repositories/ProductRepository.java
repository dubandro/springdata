package ru.geekbrains.springdata.repositories;

import ru.geekbrains.springdata.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceBetween(Double minPrice, Double maxPrice);
}
