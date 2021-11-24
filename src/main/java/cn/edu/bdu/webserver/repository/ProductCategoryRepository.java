package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

}
