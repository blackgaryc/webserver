package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductCategoryRepositoryTest {
    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    void findAll() {
        List<ProductCategory> productCategoryList = productCategoryRepository.findAll();
        for (ProductCategory productCategory:productCategoryList){
            System.out.println(productCategory);
        }
    }
    @Test
    void findOne(){
        Optional<ProductCategory> categoryOptional = productCategoryRepository.findById(10);
        ProductCategory productCategory = categoryOptional.get();
        System.out.println(productCategory);
    }
    @Test
    void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("时下热卖");
        productCategory.setCategoryType(33);
        System.out.println(productCategory.getCreateTime());
        productCategoryRepository.save(productCategory);

    }
    @Test
    void update(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(1);
        productCategory.setCategoryName("9.9专区");
        productCategory.setCategoryType(33);
        productCategoryRepository.save(productCategory);
    }
    @Test
    void delete(){
        productCategoryRepository.deleteById(16);
    }


}