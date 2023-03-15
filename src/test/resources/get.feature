@GET
Feature: GET

  @Get-List-Users-Page-1
  Scenario: Get list users per Page1
    Given can access https:reqres.in
    When get request page 1
    Then list users page on displayed

  @Get-List-Users-Page-2
  Scenario: Get list users per Page2
    Given can access https:reqres.in
    When get request page 2
    Then list users page on displayed


  @[Negative-Test]-Get-List-Page-[No-Data]
  Scenario: [Negative Test] Get list users per Page No-Data
    Given can access https:reqres.in
    When get request page 3
    Then list users not displayed



 @Get-Single-UserID-1
  Scenario: Get single user Id 1
    Given can access https:reqres.in
    When get request single user id 1
    Then specific single user displayed

  @Get-Single-UserID-2
  Scenario: Get single user Id 2
    Given can access https:reqres.in
    When get request single user id 2
    Then specific single user displayed

  @Get-Single-UserID-3
  Scenario: Get single user Id 3
    Given can access https:reqres.in
    When get request single user id 3
    Then specific single user displayed

  @Get-Single-UserID-4
  Scenario: Get single user Id 4
    Given can access https:reqres.in
    When get request single user id 4
    Then specific single user displayed

  @Get-Single-UserID-5
  Scenario: Get single user Id 5
    Given can access https:reqres.in
    When get request single user id 5
    Then specific single user displayed

  @Get-Single-UserID-6
  Scenario: Get single user Id 6
    Given can access https:reqres.in
    When get request single user id 6
    Then specific single user displayed

  @Get-Single-UserID-7
  Scenario: Get single user Id 7
    Given can access https:reqres.in
    When get request single user id 7
    Then specific single user displayed

  @Get-Single-UserID-8
  Scenario: Get single user Id 8
    Given can access https:reqres.in
    When get request single user id 8
    Then specific single user displayed

  @Get-Single-UserID-9
  Scenario: Get single user Id 9
    Given can access https:reqres.in
    When get request single user id 9
    Then specific single user displayed

  @Get-Single-UserID-10
  Scenario: Get single user Id 10
    Given can access https:reqres.in
    When get request single user id 10
    Then specific single user displayed

  @Get-Single-UserID-11
  Scenario: Get single user Id 11
    Given can access https:reqres.in
    When get request single user id 11
    Then specific single user displayed

  @Get-Single-UserID-12
  Scenario: Get single user Id 12
    Given can access https:reqres.in
    When get request single user id 12
    Then specific single user displayed


  @Get-Single-UserID-Grouping-1-sd-12
  Scenario Outline: Get single user (dari 1 s/d 12)
    Given can access https:reqres.in
    When get request single user id <UserID>
    Then specific single user displayed
    Examples:
      | UserID |
      | 1      |
      | 2      |
      | 3      |
      | 4      |
      | 5      |
      | 6      |
      | 7      |
      | 8      |
      | 9      |
      | 10     |
      | 11     |
      | 12     |
