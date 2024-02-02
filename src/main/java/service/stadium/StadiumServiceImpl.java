package service.stadium;

import base.service.BaseServiceImpl;
import model.Stadium;
import repository.stadium.StadiumRepository;

public class StadiumServiceImpl extends BaseServiceImpl<Integer, Stadium, StadiumRepository>
        implements StadiumService{
    public StadiumServiceImpl(StadiumRepository repository) {
        super(repository);
    }
}
