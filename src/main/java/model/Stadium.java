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

public class Stadium extends BaseEntity <Integer>{
    String stadiumName;
    int cityId;

    public  Stadium (int id, String stadiumName, int cityId){
        super(id);
        this.stadiumName=stadiumName;
        this.cityId=cityId;
    }
}
