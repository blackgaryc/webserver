package cn.edu.bdu.webserver.service;


import cn.edu.bdu.webserver.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.List;

public interface OrderDetailService {
    final static int OPT_EQ=0;
    final static int OPT_EQ_BIGGER=1;
    final static int OPT_EQ_SMALLER=2;
    final static int OPT_BIGGER=3;
    final static int OPT_SMALLER=4;


    public OrderDetail findOne(String detailId);

    public List<OrderDetail> findAll();
    public List<OrderDetail> findAllByOrderId(String orderId);
    public List<OrderDetail> findAllByProductId(String productId);
    public List<OrderDetail> findAllByProductName(String productName);
    public List<OrderDetail> findAllByProductPrice(BigDecimal productPrice,int opt);


    public OrderDetail save(OrderDetail orderDetail);
}
