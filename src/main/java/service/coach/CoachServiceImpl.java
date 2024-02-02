package service.coach;

import base.service.BaseServiceImpl;
import model.Coach;
import repository.coach.CoachRepository;

public class CoachServiceImpl extends BaseServiceImpl<Integer , Coach , CoachRepository>
        implements CoachService {
    public CoachServiceImpl(CoachRepository repository) {
        super(repository);
    }
}
