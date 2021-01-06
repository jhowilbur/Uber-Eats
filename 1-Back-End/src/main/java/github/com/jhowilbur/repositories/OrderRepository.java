package github.com.jhowilbur.repositories;

import github.com.jhowilbur.entities.Order;
import github.com.jhowilbur.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{

}