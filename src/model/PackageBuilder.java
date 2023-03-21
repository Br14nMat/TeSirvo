package model;

import java.util.List;

public class PackageBuilder {

    private String id;
    private List<Service> services;

    public PackageBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PackageBuilder addService(Service service) {
        services.add(service);
        return this;
    }

    public Package build() {
        return new Package(id, services);
    }
}
