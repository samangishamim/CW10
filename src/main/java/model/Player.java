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
    int teamId ;
    int contract_id ;

    public Player(int id , String playerName , int teamId , int contract_id){
        super(id);
        this.playerName=playerName;
        this.teamId=teamId;
        this.contract_id=contract_id;
    }
}
