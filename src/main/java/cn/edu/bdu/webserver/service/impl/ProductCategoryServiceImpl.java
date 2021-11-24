package cn.edu.bdu.webserver.service.impl;

import cn.edu.bdu.webserver.dataobject.ProductCategory;
import cn.edu.bdu.webserver.repository.ProductCategoryRepository;
import cn.edu.bdu.webserver.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> productCategoryOptional = productCategoryRepository.findById(categoryId);
        return productCategoryOptional.orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return null;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryRepository.saveAndFlush(productCategory);
    }
    @Override
    public Boolean delete(Integer categoryId){
        try {
            productCategoryRepository.deleteById(categoryId);

        }catch (Exception e){
            return false;
        }
        return true;
    }
}
