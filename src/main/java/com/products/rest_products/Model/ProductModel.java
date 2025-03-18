package com.products.rest_products.Model;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Products")
public class ProductModel implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    public String ProductName;
    @Column(nullable = false, unique = true, length = 7)
    private String ProductFamily;
    @Column(nullable = false, length = 70)
    private Integer Category;
    @Column(nullable = false, length = 70)
    private Integer Quantity;
    @Column(nullable = false, length = 150)
    private String Barcode;
    @Column(nullable = false)
    private LocalDateTime registrationDate;


}
