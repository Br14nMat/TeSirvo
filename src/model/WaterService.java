package model;

import java.util.Date;

public class WaterService extends BasicService{

    public WaterService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public WaterService() {

    }
}
