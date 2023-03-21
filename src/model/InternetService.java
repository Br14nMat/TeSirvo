package model;

import java.util.Date;

public class InternetService extends CommsService{

    public InternetService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public InternetService(){}
}
