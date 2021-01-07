package github.com.jhowilbur.controllers;

import github.com.jhowilbur.dto.OrderDTO;
import github.com.jhowilbur.services.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController
{
    @Autowired
    private OrderService service;

    @ApiOperation(value = "Returns a list of orders")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a list of orders"),
            @ApiResponse(code = 403, message = "You do not have permission to access this resource"),
            @ApiResponse(code = 500, message = "An exception was thrown"),
    })
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<OrderDTO>> findAll() {
        List<OrderDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> insert(@RequestBody OrderDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}/delivered")
    public ResponseEntity<OrderDTO> setDelivered(@PathVariable Long id) {
        OrderDTO dto = service.setDelivered(id);
        return ResponseEntity.ok().body(dto);
    }
}
