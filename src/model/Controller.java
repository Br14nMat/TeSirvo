package model;

import java.util.Date;

public class Controller {
    private Container container;

    public Controller(Container container){
        this.container = container;
        setUpStage1();
    }

    public void setUpStage1(){


        Client client1 = new Client("1", "Juan", new Date(), "juan@gmail.com", "Calle 1", "123456", Status.POTENCIAL);

        ServiceFactory factory = new ServiceFactory();
        Service service1 = factory.createService(ServiceType.GAS);
        Service service2 = factory.createService(ServiceType.INTERNET);
        Service service3 = factory.createService(ServiceType.PHONE);

        Package builder = new PackageBuilder()
                .setId("PAC001")
                .addService(service1)
                .addService(service2)
                .addService(service3)
                .build();


        client1.addPackage(builder);
        container.addClient(client1);

    }

}
