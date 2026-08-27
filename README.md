# spring-ai-gemini-chatclient
# Satendraxx1707-spring-ai-gemini-chatclient-app

# Spring AI Gemini ChatClient

This is a simple Spring Boot project created to understand how to integrate Google Gemini with Spring AI using `ChatClient`.

The application accepts a user query through a REST API, sends it to the Gemini LLM, and returns the generated response.


EX:
http://localhost:8082/ai/chat?query=tell me about RestClient

The query parameter is sent to the service layer.

The service uses Spring AI ChatClient to send the prompt to Gemini and returns the generated response.




Technologies Used
------------------  
Java
Spring Boot
Spring AI
Spring AI ChatClient
Google Gemini
Maven
REST API
Postman  



What I Learned
-------------------
How Spring AI works with an LLM
How to integrate Google Gemini with Spring Boot
How to use Spring AI ChatClient
How to send prompts to an LLM
How to receive AI-generated responses
How environment variables can be used for API keys


Configuration
---------------

The Gemini API key should not be hardcoded in the project.

EX.
spring.ai.google.genai.api-key=${GEMINI_API_KEY}

Set the API key as an environment variable:

EX.
GEMINI_API_KEY=your_api_key_here


Author:

Satendra Singh




<img width="1917" height="1016" alt="Screenshot 2026-08-27 053405" src="https://github.com/user-attachments/assets/f0fc5b83-cedf-4161-b998-b10019df8f65" />


<img width="1917" height="1013" alt="Screenshot 2026-08-27 051748" src="https://github.com/user-attachments/assets/ded016cd-335d-416b-91f7-71ff384f6345" />
















