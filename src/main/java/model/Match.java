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
public class Match extends BaseEntity<Integer> {
    int numberOfGoals;
    int score;
    int teamId;
    int stadiumId;


    public Match(int id,int numberOfGoals,int score,int teamId, int stadiumId){
        super(id);
        this.numberOfGoals=numberOfGoals;
        this.score=score;
        this.teamId=teamId;
        this.stadiumId=stadiumId;
    }
}
