package org.armancodeblock.httpusers.interceptor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InterceptorClientTest {
    @Autowired
    InterceptorClient interceptorClient;

    @Test
    void findAllTodos() {
        String todos = interceptorClient.findAllTodos();
        assertNotNull(todos);
    }
}