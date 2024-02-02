package service.coach;

import base.service.BaseService;
import model.Coach;

import java.sql.SQLException;

public interface CoachService extends BaseService<Integer , Coach> {
    public String getCoachMaxSalary () throws SQLException;
}
