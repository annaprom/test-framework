Meta:
@pos_smoke

Narrative:
In order to use web application
As a user
I want to enter my credentials and log into the system

Scenario: 01 User successfully login
Given User opens Login Page
When User signs on with login as login and password as password
Then User with login successfully logged in

Examples:
|login		|password	|
|annaprom	|223218Qwerty|
