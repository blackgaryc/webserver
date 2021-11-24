package cn.edu.bdu.webserver.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"zaijia"),
    DOWN(1,"xiajia");
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
