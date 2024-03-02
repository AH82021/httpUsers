In Spring Framework 6.1, a new client API called RestClient was introduced alongside the existing RestTemplate. Here's a breakdown of both and how they fit into the Spring ecosystem for making HTTP requests:

1. RestTemplate (Pre-existing)

Introduced in Spring 3.0, RestTemplate has been the go-to synchronous HTTP client for many years.
It offers a template-like approach, providing methods for various HTTP verbs (GET, POST, PUT, DELETE) and handling request/response objects.
While powerful, RestTemplate can become verbose due to its extensive method overloading for different scenarios.
2. RestClient (New in Spring 6.1)

Introduced in Spring Framework 6.1, RestClient offers a more modern, fluent API inspired by libraries like WebClient.
It leverages the underlying components of RestTemplate for message converters, request factories, and interceptors, providing a familiar foundation.
It uses a builder pattern with chained methods for configuring requests, making the syntax more concise and readable.
Key Differences and Use Cases:

Feature	              RestTemplate	                                                           RestClient
Style	              Template-like methods	                                                   Fluent API
Verbosity	        More verbose due to method overloading	                                   Concise and readable
Underlying Tech	  Leverages message converters, request factories,                             interceptors from RestTemplate	Builds upon RestTemplate components
Use Cases	Existing code using RestTemplate, complex scenarios requiring fine-grained control	New development, preference for a more modern and concise API

Additional Considerations:

Both RestTemplate and RestClient are synchronous clients, meaning the calling thread waits for the HTTP response before continuing.
For asynchronous HTTP requests, Spring offers the reactive WebClient introduced in Spring 5, which leverages Project Reactor for non-blocking I/O.
To sum up , RestClient provides a modernized and more concise alternative to RestTemplate while still utilizing the familiar foundation of Spring's existing HTTP client infrastructure. 
For new development in Spring 6, RestClient is the preferred choice, while RestTemplate remains an option for legacy code or situations requiring more granular control.