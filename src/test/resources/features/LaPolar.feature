@LaPolar
Feature: Login Functionality Feature

  @Login
  Scenario: Verify if a user will be able to login with a valid username and valid password.
    Given user navigates to LaPolar.cl
    When user click into login
    And logs in using email as “test@test.cl” and Password “test123“
    Then login should be successful



  @Register
  Scenario:  Verify if register is validating required field Rut.
    Given user navigates to LaPolar/register page
    When Register with name “testerName“ lastname “testerLastName“ phone “53“ dni “1-3“ mail “testing@testinlapolar.cl“ gender “male“ password “test123“
    Then Register send
    And login should be Failed