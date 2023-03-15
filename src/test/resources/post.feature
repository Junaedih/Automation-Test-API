@POST
Feature: POST

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Junaedih Al-Ghazali"
    Then the list of users increases

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Ruslan Hakim"
    Then the list of users increases

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Bayhaqi Sabar"
    Then the list of users increases

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Usman Arifin"
    Then the list of users increases

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Syarif Hidayat"
    Then the list of users increases

  @Post-Create-User
  Scenario: Post-Create-User
    Given https:reqres.in can access
    When post request send name "Hamidi Humairi"
    Then the list of users increases



  Scenario Outline: Post-Create-User-Group
    Given https:reqres.in can access
    When post request send name <valueName>
    Then the list of users increases
    Examples:
      | valueName |
      | "Junaedih Al-Ghazali"      |
      | "Ahmad Rifai"              |
      | "Jamaludin Al-Afghani"     |
      | "Abdurahman Al-khuarizmi"  |
      | "Ibnu Shina"               |
      | "Hermawan Aan"             |
      | "Budi Lesmana"             |
      | "Setyawan Jodi"            |
      | "Singgih Ihtiarto"         |



