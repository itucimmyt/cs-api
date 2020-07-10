package org.ebs.util.brapi;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Instant;
import java.util.Date;

import javax.annotation.PostConstruct;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.TokenExpiredException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B4RapiTokenGenerator {
    @Value("${ebs.sg.b4rapi.jwt-secret}")
    private String secret;
    private String token = null;
    private Algorithm algorithm;
    private JWTVerifier verifier;

    @PostConstruct
    public void init() {
        algorithm = Algorithm.HMAC256(secret);
        verifier = JWT.require(algorithm)
            .withIssuer("org.ebs.sg")
            .build();
    }

    public String getToken() {
          
        try {
            if(token != null)
                verifier.verify(token);
            token = generateNewToken();
        } catch (JWTCreationException e){
            
        } catch (TokenExpiredException e){
            token = generateNewToken();
        }
        return token;
    }

    private String generateNewToken(){
        return JWT.create()
            .withIssuer("org.ebs.sg")
            .withClaim("email", "irri@irri.org")
            .withClaim("userId", 1)
            .withExpiresAt(Date.from(Instant.now().plus(10, SECONDS)))
            .sign(algorithm);
    }
}