package model;

import java.util.Date;

public class PhoneService extends CommsService{

    public PhoneService(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        super(id, installationAddress, installationDate, billingDate, status);
    }

    public PhoneService(){}
}
