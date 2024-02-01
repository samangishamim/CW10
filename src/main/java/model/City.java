package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)


public class City extends BaseEntity<Integer> {
    String cityName;


}
