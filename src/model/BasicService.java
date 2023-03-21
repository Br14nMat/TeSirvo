package model;

import java.util.Date;

public abstract class BasicService extends Service{

    private Meter meter;

    public BasicService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public BasicService(){}

    public void setMeter(Meter meter) {
        this.meter = meter;
    }
}
