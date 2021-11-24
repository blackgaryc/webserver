package cn.edu.bdu.webserver.controller;

import cn.edu.bdu.webserver.dataobject.ProductCategory;
import cn.edu.bdu.webserver.dataobject.ProductInfo;
import cn.edu.bdu.webserver.service.ProductCategoryService;
import cn.edu.bdu.webserver.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Service
@RequestMapping("/seller/product")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("list")
    public ModelAndView List(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "3") Integer size, Map<String, Object> map) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(pageRequest);
        map.put("productInfoPage", productInfoPage);
        map.put("page", page);
        map.put("size", size);


        return new ModelAndView("product/list", map);
    }

}
