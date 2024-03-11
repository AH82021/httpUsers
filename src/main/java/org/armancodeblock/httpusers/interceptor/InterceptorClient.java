package org.armancodeblock.httpusers.interceptor;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
@Component
public class InterceptorClient {
    private final RestClient restClient;

    public InterceptorClient(RestClient.Builder builder, ClientHttpRequestInterceptor interceptor) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .requestFactory(new JdkClientHttpRequestFactory())
                .requestInterceptor(interceptor)
                .build();
    }

    public String findAllTodos(){
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(String.class);
    }


}
