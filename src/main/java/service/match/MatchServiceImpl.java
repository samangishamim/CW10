package service.match;

import base.service.BaseServiceImpl;
import model.Match;
import repository.match.MatchRepository;

public class MatchServiceImpl extends BaseServiceImpl<Integer, Match, MatchRepository>
        implements MatchService{
    public MatchServiceImpl(MatchRepository repository) {
        super(repository);
    }
}
