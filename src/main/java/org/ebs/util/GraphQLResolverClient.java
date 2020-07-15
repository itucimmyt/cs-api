package org.ebs.util;

import static org.ebs.Application.REQUEST_TOKEN;
import static java.util.Collections.singletonList;
import java.net.URI;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class GraphQLResolverClient {

    private static final Logger log = LoggerFactory.getLogger(GraphQLResolverClient.class);

    private final RestTemplate plantilla;
    private final MultiValueMap<String, String> headers;
    private final URI endpoint;

    public GraphQLResolverClient(URI endpoint) {
        plantilla = new RestTemplate();
        headers = new LinkedMultiValueMap<>();
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer ");
            headers.add(HttpHeaders.CONTENT_TYPE,"application/json");
        this.endpoint = endpoint;
    }
    

    public <T> T findOneEntity(String query, ParameterizedTypeReference<Map<String,Map<String,T>>> responseType) {
        T result = null;
        try {
            log.trace("Calling {} from external service: {}", query, endpoint);
            String body = String.format("{\"query\":\"{%s}\"}", query);
    
            ResponseEntity<Map<String,Map<String,T>>> response = plantilla.exchange(endpoint,
                HttpMethod.POST, requestFor(body), responseType);
    
            String queryName = query.split("\\(|\\{",2)[0];
            return response.getBody().get("data").get(queryName);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private HttpEntity<String> requestFor(String body) {
        headers.replace(HttpHeaders.AUTHORIZATION, singletonList("Bearer " + REQUEST_TOKEN.get()));
        return new HttpEntity<>(body,headers);
    }
}