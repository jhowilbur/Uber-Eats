package github.com.jhowilbur.controllers;

import github.com.jhowilbur.dto.ProductDTO;
import github.com.jhowilbur.services.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController
{
    @Autowired
    private ProductService service;

    @ApiOperation(value = "Returns a list of products")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a list of products"),
            @ApiResponse(code = 403, message = "You do not have permission to access this resource"),
            @ApiResponse(code = 500, message = "An exception was thrown"),
    })
    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
