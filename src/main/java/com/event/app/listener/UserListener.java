package com.event.app.listener;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

    @EventListener
    public UserValidatedEvent listenerUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent) {
        System.out.println("LISTERING: Event has been listened UserRegisteredEvent -> " + userRegisteredEvent.toString());
        return new UserValidatedEvent(userRegisteredEvent.getUsername(), userRegisteredEvent.getAge() >= 20);
    }

    @EventListener
    public void listenerUserValidatedEvent(UserValidatedEvent userValidatedEvent) {
        System.out.println("LISTERING: Event has been listened UserValidatedEvent -> " + userValidatedEvent.toString());
    }



}
