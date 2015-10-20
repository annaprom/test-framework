Meta:
@pos_smoke

Narrative:
In order to use web application
As a user
I want to enter my credentials and log into the system

Scenario: 01 User successfully login
Given user opens Login Page
When user signs on with <login> as login and <password> as password
Then user with <login> successfully logged in

Examples:
|login		|password	|
|annaprom	|223218Qwerty|
