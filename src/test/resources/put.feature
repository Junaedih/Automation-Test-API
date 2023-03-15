@PUT
Feature: PUT

  @Put-User-ID-1
  Scenario: Put User ID 1
    Given reqres.in can access
    When PUT request sending ID 1
    Then List Users ID Updated

  @Put-User-ID-2
  Scenario: Put User ID 2
    Given reqres.in can access
    When PUT request sending ID 2
    Then List Users ID Updated

  @Put-User-ID-3
  Scenario: Put User ID 3
    Given reqres.in can access
    When PUT request sending ID 3
    Then List Users ID Updated

  @Put-User-ID-4
  Scenario: Put User ID 4
    Given reqres.in can access
    When PUT request sending ID 4
    Then List Users ID Updated

  @Put-User-ID-5
  Scenario: Put User ID 5
    Given reqres.in can access
    When PUT request sending ID 5
    Then List Users ID Updated

  @Put-User-ID-6
  Scenario: Put User ID 6
    Given reqres.in can access
    When PUT request sending ID 6
    Then List Users ID Updated

  @Put-User-ID-7
  Scenario: Put User ID 7
    Given reqres.in can access
    When PUT request sending ID 7
    Then List Users ID Updated


  @Put-User-ID-8
  Scenario: Put User ID 8
    Given reqres.in can access
    When PUT request sending ID 8
    Then List Users ID Updated

  @Put-User-ID-9
  Scenario: Put User ID 9
    Given reqres.in can access
    When PUT request sending ID 9
    Then List Users ID Updated

  @Put-User-ID-10
  Scenario: Put User ID 10
    Given reqres.in can access
    When PUT request sending ID 10
    Then List Users ID Updated

  @Put-User-ID-11
  Scenario: Put User ID 11
    Given reqres.in can access
    When PUT request sending ID 11
    Then List Users ID Updated

  @Put-User-ID-12
  Scenario: Put User ID 12
    Given reqres.in can access
    When PUT request sending ID 12
    Then List Users ID Updated



  @Put-User-ID-1-sd-12-[Group]
  Scenario Outline: Put User ID 1 s/d 12 (Group)
    Given reqres.in can access
    When PUT request sending ID <userId>
    Then List Users ID Updated
    Examples:
      | userId |
      | 1       |
      | 2       |
      | 3       |
      | 4       |
      | 5       |
      | 6       |
      | 7       |
      | 8       |
      | 9       |
      | 10      |
      | 11      |
      | 12      |
