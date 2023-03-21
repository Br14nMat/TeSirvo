package model;

import java.util.List;

public class Container {

    private List<Client> clients;

    public Container(){
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public Client searchClient(String id){
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

}
