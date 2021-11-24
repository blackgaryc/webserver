package cn.edu.bdu.webserver.form;

import lombok.Data;

@Data
public class CategoryForm {
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
}
