Feature: GET API feature

Scenario: Get a single user 
Given  url "https://reqres.in/api"
Given  path  "/user/2"
When  method  GET
Then status  200
And match response.data.id == 2