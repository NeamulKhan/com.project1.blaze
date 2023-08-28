Feature: This feature is for log in functionality

@Login1

Scenario: verify user can login successfully with valid credentials

Given Lauch "<URL>"
Then click login link
Then enter username,password and click login button
Then verify user can successfully log in