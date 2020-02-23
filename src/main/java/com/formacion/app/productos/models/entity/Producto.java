package com.formacion.app.productos.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
@Setter
@Getter
public class Producto implements Serializable {

    private static final long serialVersionUID = 123457897891245L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @Transient
    private Integer port;
}
