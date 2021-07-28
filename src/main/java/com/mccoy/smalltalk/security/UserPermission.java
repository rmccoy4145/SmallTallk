package com.mccoy.smalltalk.security;

public enum UserPermission {
    TALKINGPOINT_WRITE("talkingpoint:write"),
    TALKINGPOINT_READ("talkingpoint:read");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }
}
