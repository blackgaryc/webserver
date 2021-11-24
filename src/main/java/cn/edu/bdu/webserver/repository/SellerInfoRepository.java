package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
}
