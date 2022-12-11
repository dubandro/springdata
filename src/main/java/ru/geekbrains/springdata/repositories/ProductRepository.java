package ru.geekbrains.springdata.repositories;

import org.springframework.data.jpa.repository.Query;
import ru.geekbrains.springdata.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceBetween(double minPrice, double maxPrice);
    List<Product> findAllByPriceIsLessThan(double maxPrice);
    List<Product> findAllByPriceIsGreaterThan(double minPrice);

    @Query("select p from Product p where p.category = :category") // будет работать и без запроса
    List<Product> findAllByCategory(String category);
}
