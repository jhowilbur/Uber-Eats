package github.com.jhowilbur.repositories;

import github.com.jhowilbur.entities.Order;
import github.com.jhowilbur.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long>
{
    //list by most oldest and only pending
    String JPQLQuery = "SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
            + "Where obj.status = 0 ORDER BY obj.moment ASC";

    @Query(JPQLQuery)
    List<Order> findOrdersWithProducts();
}