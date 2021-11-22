Feature: User is able to perform Expoense functionality


  @RegressionTest @WIP
  Scenario: User able to Log in Facebook
    Given User naviaget to Facebook


  @RegressionTest
  Scenario: User able to Log in Facebook with cucumber Data Table1
    Given User naviaget to Facebook
    And User enter data Inquiry information in form as below
    |UscisOffice|Receipt|Visa|G28match|ReasonForinquiry|
    |      WRO   |    ABC123456789   | 1B2   |   YES     |        Business Activity        |


  @RegressionTest
  Scenario: User able to Log in Facebook1 with cucumber Data Table2
    Given User naviaget to Facebook
    And User enter 2nd data Inquiry information in form as below
      |DUNS|PHONE|COMPANY|STREET|CITY|ZIP|STATE|COUNTRY|
      |      N/A   |    N/A   | TEST_AFSANA_ORG1   |   200 ST     |         ARLINGTON        |222|Virginia- VA|UNITED STATES|



  @RegressionTest
  Scenario: User able to Log in Facebook2 with cucumber Data Table3
    Given User naviaget to Facebook
    And User enter 3nd data Inquiry information in form as below
    |searchType              |   searchData      |
    | Receipt Number         |   SRC119008890    |
    |   Inquiry DUN          |    964392237      |
    |    COompany Name       |    Afsana Org     |
    |  Added By              |    aktopa         |
    |   Resolution           | Resolved by Scops |


  @RegressionTest @Now
  Scenario: User able to Log in Facebook3 with cucumber Data Table3
    Given User naviaget to Facebook
    And User enter 4th data Inquiry information in form as below
      |Names   |
      | Topa   |
      | Toma   |
      | Jafrin |
      | Tanjim |
