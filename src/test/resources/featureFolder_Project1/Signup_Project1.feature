Feature: This feature is for signup functionality


@Signup1

Scenario: verify user can sign up successfully

Given Launch "<URL>"
Then click sign up link
Then enter username, password and click signup button
Then verify signup successfull





