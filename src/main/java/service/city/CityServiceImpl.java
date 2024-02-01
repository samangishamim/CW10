package service.city;

import base.service.BaseServiceImpl;
import model.City;
import repository.city.CityRepository;

public class CityServiceImpl extends BaseServiceImpl <Integer,City,CityRepository> implements  CityService{
    public CityServiceImpl(CityRepository repository) {
        super(repository);
    }
}
