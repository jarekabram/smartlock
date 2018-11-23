package com.sec.smartlock.models;

public class User {

    private int id;
    private String name;
    private String password;
    private int lock_id;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getLock_id() { return lock_id; }
    public void setLock_id(int lock_id) { this.lock_id = lock_id; }
}
