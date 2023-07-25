Feature: JobSearch Test
  As a user I want to search job in cv library website

  @Smoke, @Regression
  Scenario Outline: User should be able to verify Job Search Result using different DataSet
    Given I am on homepage
    When I click on accept cookies
    And I enter job title "<jobTitle>"
    And I enter location  "<location>"
    And I select the distance "<distance>"
    And I click on more Search options link
    And I enter minimum salary "<salary min>"
    And I enter maximum salary "<salary max>"
    And I select salary type "<salary type>"
    And I select job type "<job type>"
    And I click on find jobs button
    Then I should be able to verify the result "<result>"

    Examples:
      | jobTitle        | location                 | distance      | salary min | salary max | salary type | job type   | result                                      |
      | Tester          | Harrow, Greater London   | 5 miles       | 30000      | 500000     | Per annum   | Permanent  | Permanent Tester jobs in Harrow             |
      | Developer       | Manchester               | 7 miles       | 40000      | 600000     | Per annum   | Contract   |Contract Developer jobs in Manchester        |
      | QA              | London                   | 2 miles       | 3000       | 5000       | Per month   | Permanent  | Permanent Qa jobs in London                 |
      | Software Tester | Edgware, Greater London  | 7 miles       | 400        | 1000       | Per day     | Permanent  |Permanent Software Tester jobs in Edgware    |
      | Developer       | London                   | 5 miles       | 60000      | 100000     | Per annum   | Temporary  |Temporary Developer jobs in London           |
      | Software Tester | Hendon, Greater London   | 5 miles       | 40000      | 60000      | Per annum   | Permanent  |Permanent Software Tester jobs in Hendon           |