package net.codejava.repositories;

import net.codejava.repositories.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByMadein(String madein);

    public List<Product> findByPriceGreaterThan(float price);

    public Product findByName(String name);

    public List<Product> findByNameNot(String name);

    public void deleteByName(String name);
}
