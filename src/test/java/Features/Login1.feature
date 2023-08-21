Feature: login Functionality


@Test
Scenario Outline: Verify successful login when username and password is correct.
Given user launch site URL
When enter correct "<username>" and "<Password>"
And click on login button
Then Validate successful login

Examples:
|username|Password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|






