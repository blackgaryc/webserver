package cn.edu.bdu.webserver.service;

import cn.edu.bdu.webserver.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    public ProductCategory findOne(Integer categoryId);

    public List<ProductCategory> findAll();

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    public ProductCategory save(ProductCategory productCategory);

    public Boolean delete(Integer categoryId);
}
