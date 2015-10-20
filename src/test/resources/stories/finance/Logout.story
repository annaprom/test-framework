Meta:
@pos_smoke

Narrative:
In order to use web application
As a user
I want to logout from the system

Scenario: 01 User successfully login
Given user successfully logged in with <login> as login and <password> as password
When user clicks on exit button
Then user on log in page

Examples:
|login		|password	|
|annaprom	|223218Qwerty|

