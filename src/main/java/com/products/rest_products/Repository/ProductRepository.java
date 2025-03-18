package com.products.rest_products.Repository;


import com.products.rest_products.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    boolean existsByBarcode(String Barcode);
    boolean existsByProductFamily(String ProductFamily);
    boolean existsByCategory(String Category);
}
