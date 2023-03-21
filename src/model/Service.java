package model;

import java.util.Date;

public abstract class Service {

    private String id;
    private String installationAddress;
    private Date installationDate;
    private Date billingDate;
    private ServiceStatus status;

    public Service(String id, String installationAddress, Date installationDate, Date billingDate, ServiceStatus status) {
        this.id = id;
        this.installationAddress = installationAddress;
        this.installationDate = installationDate;
        this.billingDate = billingDate;
        this.status = status;
    }

    public Service() {
    }

    public String getId() {
        return id;
    }

    public void changeStatus(ServiceStatus status){
        this.status = status;
    }

}
