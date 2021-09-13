#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
    
Feature: Student Rest API

@FetchStudentById
Scenario:User Calls Student Rest API to check Student Id Exist or not
Given Request with Id "101"
And Student gets retrieve by id
When Validate status code will be 200
Then Print Response

@FetchAllStudents
Scenario:User Calls Student Rest API to get all Student details
Given hit the url
And get Student Details
When Validate status code as 200
Then print Response body

   