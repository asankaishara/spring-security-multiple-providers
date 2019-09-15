# Multiple authentication providers with spring security

This example will show you how to use multiple authentication providers with spring security

- There are two types of controllers, handling REST request and browser based web requests.
- All  the public endpoints are permitted to public use.

```
    <http name="forWeb" auto-config="true" pattern="/endpoint/web/**" create-session="stateless">
        <intercept-url pattern="/endpoint/web/private/**" access="isAuthenticated()" />
        <intercept-url pattern="/endpoint/web/public/**" access="permitAll()" />
    </http>
```

```
    <http name="forRest" auto-config="true" pattern="/endpoint/rest/**" create-session="stateless">
        <intercept-url pattern="/endpoint/rest/private/**" access="isAuthenticated()" />
        <intercept-url pattern="/endpoint/rest/public/**" access="permitAll()" />
        <custom-filter before="BASIC_AUTH_FILTER" ref="apiKeyAuthenticationFilter" />
    </http>
```

- Refer the spring-security.xml for multiple auth providers configuration
- to access ``localhost:8080/endpoint/rest/private/api-key`` you need to set api key with value as 'abc' in the header
- to access ``http://localhost:8080/endpoint/web/private/basic`` you must login with username: 'ishara' and password '1234'
this authentication having some issue and will be fixed later.
 	
 	
    