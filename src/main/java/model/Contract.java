package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contract extends BaseEntity<Integer> {
    Date start ;
    Date finish ;
    BigDecimal salary ;

    public Contract(int id, Date start, Date finish, BigDecimal salary) {
        super(id);
        this.start=start;
        this.finish=finish;
        this.salary=salary;
    }
}
