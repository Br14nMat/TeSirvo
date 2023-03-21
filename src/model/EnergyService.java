package model;

import java.util.Date;

public class EnergyService extends BasicService{
    public EnergyService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }
    public EnergyService(){}
}
