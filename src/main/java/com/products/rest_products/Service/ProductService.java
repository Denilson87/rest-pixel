package com.products.rest_products.Service;

import com.products.rest_products.Model.ProductModel;
import com.products.rest_products.Repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ProductService {
    final ProductRepository productRepository;
    public ProductService(ProductService productService){
        this.productRepository = productService.productRepository;
    }
    @Transactional
    public ProductModel save(ProductModel productModel){
        return productRepository.save(productModel);
    }

    public boolean existsByBarcode (String Barcode){
        return productRepository.existsByBarcode(Barcode);
    }
    public boolean existsByProductFamily (String ProductFamily){
        return productRepository.existsByProductFamily(ProductFamily);
    }
    public boolean existsByCategory (String Category){
        return productRepository.existsByCategory(Category);
    }
    public boolean findById(UUID id){
        return productRepository.findById(id);
    }
    @Transactional
    public void delete(ProductModel productModel){
        productRepository.delete(productModel);
    }
    public Page<ProductModel>findAll(Pageable pageable){
        return productRepository.findAll(pageable);
    }


}
