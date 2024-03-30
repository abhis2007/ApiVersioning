package com.example.ApiVersioning;

// Versioning can be done in 3 ways.
    /*
    A. URI versioning
    It is one of the straight forward approach to version the REST API is by including the version number
    in the URI.

    Example -
    GET /api/v1/users
    GET /api/v2/users

    Pros -
    1. It is easy to understand and implement as version is explicitly included in the API's endpoint.
    2. Clear separation of version in the URI.

    Cons -
    1. Can lead to URL clutter and harder to read endpoints.
    2. Not recommended by the REST architecture, as URI should represent the resource not the version.

    B. Versioning using custom header


    Example -


    Pros -


    Cons -


    C. Versioning using Accept Header
    A RestFul approach to versioning the api is to include the version number in HTTP header of the
    request.

    Example -


    Pros -
    Adheres to REST principles as URI remains focussed for the resources.

    Cons -
    Not as intuitive as other methods.
    Requires more effort to inspect API requests, as the version is hidden in the headers.

    */
public class Definitions {


}
