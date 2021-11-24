package cn.edu.bdu.webserver.repository;

import cn.edu.bdu.webserver.dataobject.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class OrderDetailRespositoryTest {
    @Autowired
    OrderDetailRepository orderDetailRespository;

    @Test
    void findAll(){
        List<OrderDetail> orderDetails = orderDetailRespository.findAll();
        for(OrderDetail orderDetail:orderDetails){
            System.out.println(orderDetail);
        }
    }
    @Test
    void findOne(){
        Optional<OrderDetail> orderDetailOptional = orderDetailRespository.findById("1234567810");
        OrderDetail orderDetail = orderDetailOptional.get();
        System.out.println(orderDetail);
    }

    @Test
    void insert(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("101");
        orderDetail.setDetailId("1111111");
        orderDetail.setProductId("100001");
        orderDetail.setProductName("麻辣烫");
        orderDetail.setCreateTime(Calendar.getInstance().getTime());
        orderDetail.setUpdateTime(Calendar.getInstance().getTime());
        orderDetail.setProductPrice(BigDecimal.valueOf(45.23));
        orderDetail.setProductQuantity(2);
        orderDetailRespository.save(orderDetail);
    }

    @Test
    void update(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("555");
        orderDetailRespository.save(orderDetail);
    }

    @Test
    void delete(){
        orderDetailRespository.deleteById("1111111");
    }
}