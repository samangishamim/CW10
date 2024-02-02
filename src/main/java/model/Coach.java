package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Coach extends BaseEntity<Integer> {
    String coachName;
    int teamId;
    int contractId;

    public Coach (int id , String coachName , int teamId , int contractId){
        super(id);
        this.coachName=coachName;
        this.teamId=teamId;
        this.contractId=contractId;
    }
}

