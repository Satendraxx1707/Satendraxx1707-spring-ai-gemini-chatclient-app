package com.satendra.spring.ai.appg03;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.ToolCallingAdvisor;
import org.springframework.stereotype.Service;

@Service
public class ServiceAi {


    private ChatClient chatClient;

    public ServiceAi(ChatClient.Builder builder) {

        this.chatClient = builder.build();
    }

    public String getResponseFromAI(String prompt) {

        //  logic to call AI


     return chatClient.prompt(prompt)
             .call()
             .content();

}
}