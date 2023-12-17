package com.event.app.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class UserRegisteredEvent {

    private String username;

    private String password;

    private byte age;


}
