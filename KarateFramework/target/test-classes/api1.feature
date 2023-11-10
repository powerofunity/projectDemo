Feature: GET API feature 

Scenario: Get a list of users
Given url "https://reqres.in/api"
Given path '/users'
When  method GET
Then  status 200
And   match response.data[*].id == '#[_ >1]'


Scenario: Get a single user 
Given  url "https://reqres.in/api"
Given  path  "/user/2"
When  method  GET
Then status  200
And match response.data.id == 2


Scenario: Get a single user - user not found 
Given  url "https://reqres.in/api/users"
Given  path  "/user/1"
When   method  GET
Then   status  404


Scenario: Create a new user 
Given  url "https://reqres.in/api"
Given  path  "/users"
And    request {"name": "John Doe","job":"Software Engineer"}
When   method  POST
Then   status  201
And    match response.job == "Software Engineer"

Scenario: Update user 
Given  url "https://reqres.in/api"
Given  path  "/users/2"
And    request {"job": "zion resident"}
When   method  PUT
Then   status  200
And    match response.job == "zion resident"

Scenario: Delete user 
Given  url "https://reqres.in/api"
Given  path  "/users/2"
When   method  DELETE
Then   status  204


