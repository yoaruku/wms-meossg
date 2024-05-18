package com.meossg.mall.model.dao;

import com.meossg.mall.model.dto.ProductDTO;
import com.meossg.mall.model.dto.StockDTO;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int addProduct(ProductDTO product);

    int modifyProduct(ProductDTO product);

    int placingOrder(Map<String, Integer> map);

    ProductDTO checkProductExists(int productId);

    List<StockDTO> getAllStockList();
}