package com.model;

import net.bytebuddy.asm.Advice;

public class UserDTO {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public UserDTO(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
