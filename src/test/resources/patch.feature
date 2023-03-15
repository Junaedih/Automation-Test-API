@PATCH
Feature: PATCH

  @Patch-User-ID-1
  Scenario: Patch User ID 1
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 1
    Then List users updated

  @Patch-User-ID-2
  Scenario: Patch User ID 2
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 2
    Then List users updated

  @Patch-User-ID-3
  Scenario: Patch User ID 3
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 3
    Then List users updated

  @Patch-User-ID-4
  Scenario: Patch User ID 4
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 4
    Then List users updated

  @Patch-User-ID-5
  Scenario: Patch User ID 5
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 5
    Then List users updated

  @Patch-User-ID-6
  Scenario: Patch User ID 6
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 6
    Then List users updated

  @Patch-User-ID-6
  Scenario: Patch User ID 6
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 6
    Then List users updated

  @Patch-User-ID-7
  Scenario: Patch User ID 7
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 7
    Then List users updated

  @Patch-User-ID-8
  Scenario: Patch User ID 8
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 8
    Then List users updated

  @Patch-User-ID-9
  Scenario: Patch User ID 9
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 9
    Then List users updated

  @Patch-User-ID-10
  Scenario: Patch User ID 10
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 10
    Then List users updated

  @Patch-User-ID-11
  Scenario: Patch User ID 11
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 11
    Then List users updated


  @Patch-User-ID-12
  Scenario: Patch User ID 12
    Given link url https reqres.in can access
    When Patch Request User Sending user id : 12
    Then List users updated


  @Patch-User-ID-1-sd-12
  Scenario Outline: Patch User
    Given link url https reqres.in can access
    When Patch Request User Sending user id : <userId>
    Then List users updated
    Examples:
      | userId  |
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

