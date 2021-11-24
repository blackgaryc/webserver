package cn.edu.bdu.webserver.dataobject;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
@Data
@DynamicUpdate
public class SellerInfo {
    @Id
    @GeneratedValue
    private String id;
    @Column(name = "username")
    private String username;
    private String password;
    @Column(name = "openid")
    private String openid;
    private Date createTime;
    private Date updateTime;
    @Column(name = "open_id")
    private String openId;
    @Column(name = "user_name")
    private String userName;
}
