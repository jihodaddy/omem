package com.springboot.omem.member.enums;

public enum Role {
    GUEST("guest"),USER("user");

    private String role;

    Role(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}
