package cn.edu.bdu.webserver.service;

import cn.edu.bdu.webserver.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findAll();

    List<ProductInfo> findAllUp();

    List<ProductInfo> findAllDown();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    ProductInfo onSale(String productId);

    ProductInfo offSale(String productId);


}
