package com.mccoy.smalltalk.security;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum UserRole {
    ADMIN(Stream.of(UserPermission.TALKINGPOINT_WRITE, UserPermission.TALKINGPOINT_READ)
            .collect(Collectors.toCollection(HashSet::new)));

    private final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions() {
        return permissions;
    }

}
