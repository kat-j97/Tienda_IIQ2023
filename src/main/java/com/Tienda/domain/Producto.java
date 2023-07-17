package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data 
@Entity
@Table(name="producto")
public class Producto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Producto")
    private Long idProducto;
  
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;
    private String rutaImagen;
    
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public Producto() {
    }
    
    
}