package com.example.api_rest.controller;

import com.example.api_rest.entity.Orden;
import com.example.api_rest.repository.OrdenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    private final OrdenRepository repository;

    public OrdenController(OrdenRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Orden> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Orden obtener(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Orden crear(@RequestBody Orden orden) {
        return repository.save(orden);
    }

    @PutMapping("/{id}")
    public Orden actualizar(@PathVariable Integer id, @RequestBody Orden orden) {
        orden.setId(id);
        return repository.save(orden);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
