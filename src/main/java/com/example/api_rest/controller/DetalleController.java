package com.example.api_rest.controller;

import com.example.api_rest.entity.Detalle;
import com.example.api_rest.repository.DetalleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleController {

    private final DetalleRepository repository;

    public DetalleController(DetalleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Detalle> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Detalle obtener(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Detalle crear(@RequestBody Detalle detalle) {
        return repository.save(detalle);
    }

    @PutMapping("/{id}")
    public Detalle actualizar(@PathVariable Integer id, @RequestBody Detalle detalle) {
        detalle.setId(id);
        return repository.save(detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
