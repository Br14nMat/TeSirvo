package model;

public class ServiceFactory {

    public Service createService(ServiceType serviceType){

        Service service = null;

        switch (serviceType){
            case PHONE:
                service = new PhoneService();
                break;
            case INTERNET:
                service = new InternetService();
                break;
            case GAS:
                service = new GasService();
                break;
            case ENERGY:
                service = new EnergyService();
                break;
            case WATER:
                service = new WaterService();
                break;
        }

        return service;
    }

}
