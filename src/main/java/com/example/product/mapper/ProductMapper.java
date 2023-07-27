package com.example.product.mapper;


import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product requestToEntity(ProductRequest request);
    ProductResponse entityToResponse(Product product);

}
