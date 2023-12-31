package com.model2.mvc.service.product;

import java.util.List;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

public interface ProductService {

    public Product addProduct(Product product) throws Exception;

    public Product getProduct(int prod_no) throws Exception;

    public Map<String, Object> getProductList(Search search) throws Exception;

    public int updateProduct(Product product) throws Exception;

    public List<String> getProductListName() throws Exception;

}