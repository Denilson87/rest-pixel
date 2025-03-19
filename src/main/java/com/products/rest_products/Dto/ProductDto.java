package com.products.rest_products.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductDto {
    @NotBlank
    private String ProductName;
    @NotBlank
    @Size(max =50)
    private String ProductFamily;
    @NotBlank
    private String Category;
    @NotBlank
    private String Quantity;
    @NotBlank
    private String Barcode;


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductFamily() {
        return ProductFamily;
    }

    public void setProductFamily(String productFamily) {
        ProductFamily = productFamily;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }



}
