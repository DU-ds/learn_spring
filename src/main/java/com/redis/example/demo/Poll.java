package com.redis.example.demo;
import java.util.UUID;
public class Poll {
    //    private UUID id;
    private UUID id;
    public Poll(String query){
        System.out.println(query);
        this.id = UUID.randomUUID();
//    fromString(query);

    }

    public UUID getId() {
        return id;
    }
}
