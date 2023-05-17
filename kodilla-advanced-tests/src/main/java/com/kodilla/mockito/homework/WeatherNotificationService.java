package com.kodilla.mockito.homework;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<Location, Set<Client>> subscribers;

    public WeatherNotificationService() {
        subscribers = new HashMap<>();
    }

    public void addSubscriber(Client client, Location location) {
        if (!subscribers.containsKey(location)) {
            subscribers.put(location, new HashSet<>());
        }
        subscribers.get(location).add(client);

    }


    public void removeSubscriber(Client client, Location location) {
        if (subscribers.containsKey(location)) {
            subscribers.get(location).remove(client);
            if (subscribers.get(location).isEmpty()) {
                subscribers.remove(location);
            }
        }
    }

    public void removeSubscriber(Client client) {
        for (Set<Client> clientSet : subscribers.values()) {
            clientSet.remove(client);
        }
    }

    public Set<Location> getSubscribedLocations(Client client) {
        Set<Location> subscribedLocations = new HashSet<>();
        for (Map.Entry<Location, Set<Client>> entry : subscribers.entrySet()) {
            if (entry.getValue().contains(client)) {
                subscribedLocations.add(entry.getKey());
            }
        }
        return subscribedLocations;
    }

    public boolean isClientSubscribed(Client client, Location location) {
        return subscribers.containsKey(location) && subscribers.get(location).contains(client);
    }

    public void sendNotificationToLocation(Notification notification, Location location) {
        if (subscribers.containsKey(location)) {
            for (Client client : subscribers.get(location)) {
                client.receive(notification);
            }
        }
    }

    public void sendNotificationToAll(Notification notification) {
        for (Set<Client> clientSet : subscribers.values()) {
            for (Client client : clientSet) {
                client.receive(notification);
            }
        }
    }

    public void removeLocation(Location location) {
        subscribers.remove(location);
    }
}

