package com.redis.example.demo;
import java.util.UUID;
public class Poll {
    private UUID id;
    public Poll(String query){
        this.id = UUID.fromString(query);
    }
}
