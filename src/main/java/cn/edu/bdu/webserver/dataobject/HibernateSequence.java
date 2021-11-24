package cn.edu.bdu.webserver.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
//@Data
//@DynamicUpdate
public class HibernateSequence {
//    @Id
    private Long next_val;
}
