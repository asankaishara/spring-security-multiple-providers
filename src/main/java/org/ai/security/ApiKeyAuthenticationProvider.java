package org.ai.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component("apiKeyAuthenticationProvider")
public class ApiKeyAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {

        ApiKeyAuthenticationToken apiKeyAuthenticationToken = (ApiKeyAuthenticationToken)auth;
        if(apiKeyAuthenticationToken.getCredentials().equals("abc")) {
            apiKeyAuthenticationToken.setAuthenticated(true);
            return apiKeyAuthenticationToken;
        } else {
            throw new BadCredentialsException("Invalid API Key");
        }
    }

    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(ApiKeyAuthenticationToken.class);
    }

}
