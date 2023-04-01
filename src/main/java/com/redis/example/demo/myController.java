package com.redis.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping("/poll")
    public String poll(String query) {
        // check redis for results
        // private redis = new RedisController()
        // redis.check()
//        private static boolean ready = false;
  //      if (ready){
            return "done";
            // return results when ready
    //    } else {
      //      return new Poll(query);
        //}
    }
}

