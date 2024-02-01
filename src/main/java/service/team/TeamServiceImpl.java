package service.team;

import base.service.BaseServiceImpl;
import model.Team;
import repository.team.TeamRepository;

public class TeamServiceImpl extends BaseServiceImpl<Integer , Team , TeamRepository>
        implements TeamService {
    public TeamServiceImpl(TeamRepository repository) {
        super(repository);
    }
}
