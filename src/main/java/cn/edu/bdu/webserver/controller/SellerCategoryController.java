package cn.edu.bdu.webserver.controller;

import cn.edu.bdu.webserver.dataobject.ProductCategory;
import cn.edu.bdu.webserver.form.CategoryForm;
import cn.edu.bdu.webserver.service.ProductCategoryService;
import jdk.jfr.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/seller/category")
public class SellerCategoryController {
    @Autowired
    ProductCategoryService categoryService;

    @GetMapping("list")
    public ModelAndView List(Map<String, Object> map) {
        List<ProductCategory> categoryList = categoryService.findAll();
        map.put("categoryList", categoryList);
        return new ModelAndView("category/list", map);
    }

    @GetMapping("index")
    public ModelAndView index(@RequestParam(value = "categoryId",required = false) Integer categoryId,Map<String, Object> map) {
        if (categoryId!=null){
            ProductCategory productCategory = categoryService.findOne(categoryId);
            if (null==productCategory){
                map.put("msg", "not find");
                map.put("url", "/seller/category/index");
                return new ModelAndView("common/error", map);
            }
            map.put("productCategory",productCategory);
        }
        return new ModelAndView("category/index", map);
    }

    @GetMapping("save")
    public ModelAndView save(@Valid CategoryForm categoryForm, BindingResult bindingResult, Map<String, Object> map) {
        //校验参数
        if (bindingResult.hasErrors()) {
            map.put("msg", Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
            map.put("url", "/seller/category/index");
            return new ModelAndView("common/error");
        }
        //参数处理
        ProductCategory productCategory = new ProductCategory();
        try {
            //id非空时查询数据库是否存在id
            if (null!=categoryForm.getCategoryId())
            productCategory=categoryService.findOne(categoryForm.getCategoryId());
            if (null==productCategory){
                map.put("msg", "not find getCategoryId");
                map.put("url", "/seller/category/index");
                return new ModelAndView("common/error", map);
            }
            //更新productCategory的实体类
            BeanUtils.copyProperties(categoryForm, productCategory);
            categoryService.save(productCategory);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
            map.put("url", "/seller/category/index");
            return new ModelAndView("common/error", map);

        }
        map.put("url", "/seller/category/index");
        return new ModelAndView("common/success", map);
    }
}
