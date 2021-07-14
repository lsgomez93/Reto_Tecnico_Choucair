# Autor: Leidy

@stories
Feature: UTest

  As a user,  I want to fill out the registration form on the Utest.com page, to create a new user

  @scenario1
  Scenario: Create a user
    Given than Leidy wants fill out form to Registre in the page Utest

    When she enter the data of the New User
      | strFirsName | strLastName | strEmail            | strMonth | strDay | strYear | strMobil | strVersionMobil | strOsMobil    | strPassword          | strConfirmPassword   |
      | Leidy       | Gomez       | jm5ucjaj555@gmai.com | March    | 5      | 1994    | Alcatel  | One Touch Idol  | Android 5.1.1 | GBnKe3f3qNnBU8AR5mAU | GBnKe3f3qNnBU8AR5mAU |

    Then she gets the new user and show welcome page Welcome to the world's largest community of freelance software testers!



