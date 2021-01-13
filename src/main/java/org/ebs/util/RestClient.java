package org.ebs.util;

import static org.ebs.Application.REQUEST_TOKEN;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class RestClient {

    private static final Logger log = LoggerFactory.getLogger(RestClient.class);

    private final RestTemplate template;
    private final MultiValueMap<String, String> headers;
    private final URI endpoint;

    public RestClient(URI endpoint) {
        template = new RestTemplate();
        headers = new LinkedMultiValueMap<>();
        headers.add(CONTENT_TYPE,"application/json");
        headers.add(AUTHORIZATION, "Bearer "+ REQUEST_TOKEN.get());

        this.endpoint = endpoint;
    }

    public <T,R> R post(String resourcePath, T body, Class<R> returnedClass) {
        ResponseEntity<R> response = null;
        try {
            log.trace("Calling {}{}", endpoint, resourcePath);

            response = template.postForEntity(endpoint + resourcePath,
                requestFor(body),returnedClass, new HashMap<>());


        } catch(Exception e) {
            log.error("Could not invoke service: {}{}. Cause: ", endpoint, resourcePath, e.getMessage());
            e.printStackTrace();
            return null;
        }
        return response.getBody();
    }

    public <T,R> R get(String resourcePath, Map<String,String> variables, Class<R> returnedClass) {
        ResponseEntity<R> response = null;
        try {
            log.trace("Calling {}{}", endpoint, resourcePath);

            response = template.getForEntity(endpoint + resourcePath,
                returnedClass);
        } catch(Exception e) {
            log.error("Could not invoke service: {}{}. Cause: ",endpoint, resourcePath, e.getMessage());
            e.printStackTrace();
            return null;
        }
        return response.getBody();
    }

    private HttpEntity<Object> requestFor(Object body) {
        return new HttpEntity<>(body,headers);
    }

}