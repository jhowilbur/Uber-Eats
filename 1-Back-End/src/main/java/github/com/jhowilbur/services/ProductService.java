package github.com.jhowilbur.services;

import github.com.jhowilbur.dto.ProductDTO;
import github.com.jhowilbur.entities.Product;
import github.com.jhowilbur.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService
{
    //example without a spring framework
    private ProductRepository repository;
    //necessary to avoid strong coupling
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findByOrderByNameAsc();
        // for converting list from Product to ProductDTO
        return list.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
    }
}
