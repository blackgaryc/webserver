package cn.edu.bdu.webserver.service.impl;

import cn.edu.bdu.webserver.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl {
    @Autowired
    OrderDetailRepository orderDetailRepository;
}
