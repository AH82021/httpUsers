package org.armancodeblock.httpusers.client;

//@Component
//public class UserRestClient {
//    private final RestClient restClient;
//
//    public UserRestClient(RestClient.Builder builder) {
//        this.restClient = builder.
//                baseUrl("https://jsonplaceholder.typicode.com/")
//                .build();
//    }
//
//    public List<User> getUsers() {
//        return  restClient
//                .get().uri("/users")
//                .retrieve()
//                .body(new ParameterizedTypeReference<>() {
//                });
//    }
//
//    public User getById(Integer id) {
//        return restClient.get()
//                .uri("/users/{id}",id)
//                .retrieve()
//                .body(User.class);
//    }
//
//}
