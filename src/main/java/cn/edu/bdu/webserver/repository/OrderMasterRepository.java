package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
