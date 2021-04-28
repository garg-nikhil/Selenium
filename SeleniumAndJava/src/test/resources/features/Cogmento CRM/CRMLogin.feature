#Author: Nikhil Garg
@UItest
Feature: Application Under Test is CRM

  Scenario: Check login
    Given Launch CRM website
    When Username and password is provided
    Then user should be able to login successfully
	