package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Team extends BaseEntity<Integer> {

    String teamName ;
    int cityId ;

    public Team (int id , String teamName , int cityId){
        super(id);
        this.teamName=teamName;
        this.cityId=cityId;
    }
}
