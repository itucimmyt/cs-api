package org.ebs.util.brapi;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class BrapiClient {

    private static final Logger log = LoggerFactory.getLogger(BrapiClient.class);

    private final RestTemplate template;
    private final MultiValueMap<String, String> headers;
    private final URI brEndpoint;
    private final B4RapiTokenGenerator tokenGenerator;

    public BrapiClient(URI brEndpoint, B4RapiTokenGenerator tokenGenerator) {
        template = new RestTemplate();
        headers = new LinkedMultiValueMap<>();
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer "+ tokenGenerator.getToken());
            headers.add(HttpHeaders.CONTENT_TYPE,"application/json");
            headers.add("Authorizarion", "");
        
        this.brEndpoint = brEndpoint;
        this.tokenGenerator = tokenGenerator;
    }
    

    public <T> BrResponse<T> post(String resourcePath, List<T> body, Class<T> returnedClass) {
        ResponseEntity<BrResponse<T>> response = null;
        try {
            log.trace("Calling {} from external service: {}", resourcePath, brEndpoint);
            headers.replace("Authorizarion",Collections.singletonList(tokenGenerator.getToken()));
            HttpEntity<List<T>> req = new HttpEntity<>(body,headers);
            
            ResolvableType resolvableType = ResolvableType.forClassWithGenerics(BrResponse.class, returnedClass);
            ParameterizedTypeReference<BrResponse<T>> typeRef = ParameterizedTypeReference.forType(resolvableType.getType());

            response = template.exchange(brEndpoint, HttpMethod.POST, req, typeRef);
    
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        return response.getBody();
    }

    public <T> BrResponse<T> get(String resourcePath, Class<T> returnedClass) {
        ResponseEntity<BrResponse<T>> response = null;
        try {
            log.trace("Calling {} from external service: {}", resourcePath, brEndpoint);
            
            ResolvableType resolvableType = ResolvableType.forClassWithGenerics(BrResponse.class, returnedClass);
            ParameterizedTypeReference<BrResponse<T>> typeRef = ParameterizedTypeReference.forType(resolvableType.getType());
            response = template.exchange(brEndpoint, HttpMethod.GET, null, typeRef);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        return response.getBody();
    }

}