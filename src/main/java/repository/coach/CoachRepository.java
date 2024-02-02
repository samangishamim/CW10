package repository.coach;

import base.repository.BaseRepository;
import model.Coach;

import java.sql.SQLException;

public interface CoachRepository extends BaseRepository<Integer , Coach> {
    public String getCoachMaxSalary () throws SQLException;
}
