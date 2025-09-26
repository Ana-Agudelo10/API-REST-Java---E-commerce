package com.example.api_rest.entity;

import com.example.api_rest.entity.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String direccion;
    private String email;
    private String nombre;
    private String password;
    private String telefono;
    private String tipo;
    private String username;

    public Usuario() {}

    public Usuario(String direccion, String email, String nombre, String password, String telefono, String tipo, String username) {
        this.direccion = direccion;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
        this.telefono = telefono;
        this.tipo = tipo;
        this.username = username;
    }

    // ✅ Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
