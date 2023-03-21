package model;

import java.util.Date;

public class GasService extends BasicService{

    public GasService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public GasService(){}
}
