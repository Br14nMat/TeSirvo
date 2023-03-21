package model;

import java.util.Date;

public abstract class CommsService extends Service{

    private ContractType contractType;

    public CommsService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public CommsService(){}

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

}
