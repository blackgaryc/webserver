package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
}
