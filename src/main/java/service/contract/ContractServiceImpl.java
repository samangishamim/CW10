package service.contract;

import base.service.BaseServiceImpl;
import model.Contract;
import repository.contract.ContractRepository;

public class ContractServiceImpl extends BaseServiceImpl <Integer , Contract , ContractRepository>
        implements ContractService {
    public ContractServiceImpl(ContractRepository repository) {
        super(repository);
    }
}
