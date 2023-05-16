package com.kodilla.mockito.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WeatherNotificationServiceTestSuite {

        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client1 = mock(Client.class);
        Client client2 = mock(Client.class);
        Location location1 = mock(Location.class);
        Location location2 = mock(Location.class);

        Notification notification = mock(Notification.class);


    @Test
    public void ShouldSubscribeClientToLocationAndGetNotification() {
        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.sendNotificationToLocation(notification,location1);

        assertTrue(weatherNotificationService.isClientSubscribed(client1, location1));
        verify(client1).receive(notification);

    }


    @Test
    public void ShouldUnsubscribeClientFromLocation() {
        weatherNotificationService.addSubscriber(client1, location1);

        weatherNotificationService.removeSubscriber(client1, location1);

        assertFalse(weatherNotificationService.isClientSubscribed(client1, location1));
    }

    @Test
    public void ShouldRemoveClientFromAllLocations() {
        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.addSubscriber(client1, location2);

        weatherNotificationService.removeSubscriber(client1);

        assertFalse(weatherNotificationService.isClientSubscribed(client1, location1));
        assertFalse(weatherNotificationService.isClientSubscribed(client1, location2));
    }

    @Test
    public void ShouldSendNotificationToSubscribedClientsInLocation() {
        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.addSubscriber(client2, location1);

        weatherNotificationService.sendNotificationToLocation(notification, location1);

        verify(client1).receive(notification);
        verify(client2).receive(notification);
    }

    @Test
    public void ShouldSendNotificationToAllSubscribedClients() {
        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.addSubscriber(client2, location2);

        weatherNotificationService.sendNotificationToAll(notification);

        verify(client1).receive(notification);
        verify(client2).receive(notification);
    }

    @Test
    public void ShouldRemoveLocationAndUnsubscribeClients() {

        weatherNotificationService.addSubscriber(client1, location1);
        weatherNotificationService.addSubscriber(client2, location2);

        weatherNotificationService.removeLocation(location1);

        assertFalse(weatherNotificationService.isClientSubscribed(client1, location1));
        assertTrue(weatherNotificationService.isClientSubscribed(client2, location2));
    }


    }

