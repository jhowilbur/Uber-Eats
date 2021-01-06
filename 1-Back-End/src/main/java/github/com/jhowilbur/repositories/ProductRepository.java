package github.com.jhowilbur.repositories;

import github.com.jhowilbur.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    //to organize in ascending order
    List<Product> findByOrderByNameAsc();
}