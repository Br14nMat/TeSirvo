package model;

import java.util.List;

public class Package {

    private String id;
    private List<Service> services;

    public Package(String id, List<Service> services) {
        this.id = id;
        this.services = services;
    }

    public void deleteService(Service service) {
        services.remove(service);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void updateService(Service service) {
        services.set(services.indexOf(service), service);
    }

    public Service searchService(String id){
        for (Service service : services) {
            if (service.getId().equals(id)) {
                return service;
            }
        }
        return null;
    }

}
