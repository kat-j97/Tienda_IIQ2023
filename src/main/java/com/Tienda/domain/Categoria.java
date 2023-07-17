package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data //Se usa para sacar el set and get de forma implicita(se ve con el "navigator")>> Se necesita la dependendia en el POM de lombok
@Entity  // es de hibernate y para que sea una entidad
@Table(name = "categoria")
public class Categoria implements Serializable /* El Serializable sirve para que el objeto se pueda convertir y se interprete en otro tecnolg (de java a SQL por ejm)*/ {

    //Version de serializacion. Para que siempre use la misma version y no pueda leer de otra version.
    private static final long serialVersionUID = 1L;   //es de hibernate 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") //sirve para saber de que tabla se habla en sql aunque el nombre del PK se ponga diferente en Java
    private Long idCategoria; // Hibernate transforma en id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name="id_categoria")
    private List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

}