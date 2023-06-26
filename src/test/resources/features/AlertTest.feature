@Test
Feature: Test the Alert and Popup handling

Scenario: Prompt alert
Given Navigate to https://demo.guru99.com/test/delete_customer.php
When Enter usersID into input delete Customer by Id
And Click submit bottom
And Accept the confirmation alert
Then Fijarte que la simple alert diga Customer Successfully Delete!
And Accept the simple alert