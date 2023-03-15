@Deleted
Feature: DELETE

  @Delete-User-Id-1
  Scenario: Delete User Id 1
    Given https reqres.in can access
    When Request Deleted User Sending user id : 1
    Then Reduced list of users

  @Delete-User-Id-2
  Scenario: Delete User Id 2
    Given https reqres.in can access
    When Request Deleted User Sending user id : 2
    Then Reduced list of users

  @Delete-User-Id-3
  Scenario: Delete User
    Given https reqres.in can access
    When Request Deleted User Sending user id : 3
    Then Reduced list of users

  @Delete-User-Id-4
  Scenario: Delete User
    Given https reqres.in can access
    When Request Deleted User Sending user id : 4
    Then Reduced list of users

  @Delete-User-Id-5
  Scenario: Delete User
    Given https reqres.in can access
    When Request Deleted User Sending user id : 5
    Then Reduced list of users

  @Delete-User-Id-6
  Scenario: Delete User Id 6
    Given https reqres.in can access
    When Request Deleted User Sending user id : 6
    Then Reduced list of users


  @Delete-User-Id-7
  Scenario: Delete User Id 7
    Given https reqres.in can access
    When Request Deleted User Sending user id : 7
    Then Reduced list of users



  @Delete-User-Id-8
  Scenario: Delete User Id 8
    Given https reqres.in can access
    When Request Deleted User Sending user id : 8
    Then Reduced list of users


  @Delete-User-Id-9
  Scenario: Delete User Id 9
    Given https reqres.in can access
    When Request Deleted User Sending user id : 9
    Then Reduced list of users

  @Delete-User-Id-10
  Scenario: Delete User Id 10
    Given https reqres.in can access
    When Request Deleted User Sending user id : 10
    Then Reduced list of users

  @Delete-User-Id-11
  Scenario: Delete User Id 11
    Given https reqres.in can access
    When Request Deleted User Sending user id : 11
    Then Reduced list of users


  @Delete-User-Id-12
  Scenario: Delete User Id 12
    Given https reqres.in can access
    When Request Deleted User Sending user id : 12
    Then Reduced list of users


  @Delete-User-Id-1-sd-12-Group
  Scenario Outline: Delete User (Group)
    Given https reqres.in can access
    When Request Deleted User Sending user id : <UserId>
    Then Reduced list of users
    Examples:
      | UserId  |
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