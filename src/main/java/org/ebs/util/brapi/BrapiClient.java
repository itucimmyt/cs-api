package org.ebs.util.brapi;

import static java.util.Collections.singletonList;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpEntity;
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
        headers.add(CONTENT_TYPE,"application/json");
        headers.add(AUTHORIZATION, "");
        
        this.brEndpoint = brEndpoint;
        this.tokenGenerator = tokenGenerator;
    }
    
    public <T> BrResponse<T> post(String resourcePath, List<T> body, Class<T> returnedClass) {
        ResponseEntity<BrResponse<T>> response = null;
        try {
            log.trace("Calling {}{}", brEndpoint, resourcePath);
            
            ResolvableType resolvableType = ResolvableType.forClassWithGenerics(BrResponse.class, returnedClass);
            ParameterizedTypeReference<BrResponse<T>> typeRef = ParameterizedTypeReference.forType(resolvableType.getType());
            response = template.exchange(brEndpoint, HttpMethod.POST, requestFor(body), typeRef);
    
        } catch(Exception e) {
            log.error("Could not invoke service: {}. Cause: ", resourcePath, e.getMessage());
            return null;
        }
        return response.getBody();
    }

    /**
     * Returns a Brapi response expecting a single element
     * @param <T>
     * @param resourcePath relative path for the resource
     * @param returnedClass the type for the element returned
     * @return a Brapi response object
     */
    public <T> BrResponse<T> get(String resourcePath, Class<T> returnedClass) {
        ResponseEntity<BrResponse<T>> response = null;
        try {
            log.trace("Calling {}{}", brEndpoint, resourcePath);
            
            ResolvableType resolvableType = ResolvableType.forClassWithGenerics(BrResponse.class, returnedClass);
            ParameterizedTypeReference<BrResponse<T>> typeRef = ParameterizedTypeReference.forType(resolvableType.getType());
            response = template.exchange(brEndpoint + resourcePath, HttpMethod.GET, requestFor(null), typeRef);

        } catch(Exception e) {
            log.error("Could not invoke service: {}. Cause: ", resourcePath, e.getMessage());
            return null;
        }
        return response.getBody();
    }

    /**
     * Returns a Brapi response expecting a list of elements
     * @param <T>
     * @param resourcePath relative path for the resource
     * @param returnedClass the type for the elements returned
     * @return a Brapi response object
     */
    public <T> BrPagedResponse<T> getList(String resourcePath, Class<T> returnedClass) {
        ResponseEntity<BrPagedResponse<T>> response = null;
        try {
            log.trace("Calling {}{}", brEndpoint, resourcePath);

            ResolvableType resolvableType = ResolvableType.forClassWithGenerics(BrPagedResponse.class, returnedClass);
            ParameterizedTypeReference<BrPagedResponse<T>> typeRef = ParameterizedTypeReference.forType(resolvableType.getType());
            response = template.exchange(brEndpoint + resourcePath, HttpMethod.GET, requestFor(null), typeRef);

        } catch(Exception e) {
            log.error("Could not invoke service: {}. Cause: ", resourcePath, e.getMessage());
            return null;
        }
        return response.getBody();
    }


    private HttpEntity<Object> requestFor(Object body) {
        headers.replace(AUTHORIZATION, singletonList("Bearer " + tokenGenerator.getToken()));
        return new HttpEntity<>(body,headers);
    }

}