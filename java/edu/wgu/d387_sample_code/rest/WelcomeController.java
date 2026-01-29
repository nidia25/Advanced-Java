package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.locale.DisplayMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@RestController
@CrossOrigin
@RequestMapping("/resources")
public class WelcomeController {

    //executors
    private Executor ex = Executors.newFixedThreadPool(2);

    @GetMapping("welcome")
    public ResponseEntity<List<String>>getWelcomeMessages() {
        List<String> l = new ArrayList<String>();

        //en_US
        ex.execute(() -> {
            DisplayMessage rrEN = new DisplayMessage("en", "US");
            l.add(rrEN.getWelcomeMessages());
            System.out.println("en_US Message Received!");
        });

        //fr_CA
        ex.execute(() -> {
            DisplayMessage rrFr = new DisplayMessage("fr", "CA");
            l.add(rrFr.getWelcomeMessages());
            System.out.println("fr_CA Message Received!");
        });
        return ResponseEntity.ok(l);
    }
}
