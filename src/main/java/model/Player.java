package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player extends BaseEntity<Integer> {
    String playerName ;
    BigDecimal salary ;
    int teamId ;

    public Player(int id , String playerName , BigDecimal salary , int teamId){
        super(id);
        this.playerName=playerName;
        this.salary=salary;
        this.teamId=teamId;
    }
}
