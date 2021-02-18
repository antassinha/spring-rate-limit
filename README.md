A sample project to understand bucket4j for rate limiting on spring boot apis.
It uses a token-bucket algorithm to implement the rate limiter. read : https://en.wikipedia.org/wiki/Token_bucket
Used Spring's Mvc configurer and HandlerInterceptior for customer interception of api requests and handling.

Docs: bucket4j- https://github.com/vladimir-bukhtoyarov/bucket4j
HandlerInterceptor for springMVC : https://www.baeldung.com/spring-mvc-handlerinterceptor
