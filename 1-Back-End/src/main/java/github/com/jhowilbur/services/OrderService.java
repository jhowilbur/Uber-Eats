package github.com.jhowilbur.services;

import github.com.jhowilbur.dto.OrderDTO;
import github.com.jhowilbur.dto.ProductDTO;
import github.com.jhowilbur.entities.Order;
import github.com.jhowilbur.entities.Product;
import github.com.jhowilbur.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService
{
    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrdersWithProducts();
        // for converting list from Product to ProductDTO
        return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
    }
}
