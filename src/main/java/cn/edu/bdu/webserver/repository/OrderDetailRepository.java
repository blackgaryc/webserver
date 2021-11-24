package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
