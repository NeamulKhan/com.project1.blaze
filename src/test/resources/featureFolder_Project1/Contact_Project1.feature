Feature: This feature is for contact functionality

@Contact1

Scenario: verify user can send msg through contact functionality

Given Launch "<URL>"
Then click contactLink
Then enter email,name and msg and click send msg button
Then verify received msg