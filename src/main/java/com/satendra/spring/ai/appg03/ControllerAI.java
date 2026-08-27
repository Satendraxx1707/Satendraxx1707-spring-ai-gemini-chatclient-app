package com.satendra.spring.ai.appg03;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/ai")
public class ControllerAI {



     private final ServiceAi serviceai;

    public ControllerAI(ServiceAi serviceai) {

        this.serviceai = serviceai;
    }


    // Mapping

    @GetMapping("/chat")
   public ResponseEntity<String> getResponseFromAI(@RequestParam String query){

          String  response   = serviceai.getResponseFromAI(query);

  return ResponseEntity.ok(response);

   }

}
