Feature: Items Test

  Background:
    Given User should be logged in successfully
    Then User clicks on Items header button.

  Scenario:
    When user clicks on New Item button
    And Fill in required fields to create new item with "Телефон8" for name, "155.00" for price, "1" for quantity
    Then Click on Add item button
    And Confirmation message "Артикулът е добавен успешно." should be seen

  Scenario:
    When user clicks on New Item button
    And Fill in required fields to create new item with "155.00" for price, "1" for quantity and leaving mame field blank.
    Then Click on Add item button
    And Error message "Моля, въведете име/номенклатура на артикула." should be seen

  Scenario Outline:
    When user clicks on New Item button
    And Fill in required fields to create new item with "<itemName>" for name, "<price>" for price, "<quantity>" for quantity
    Then Click on Add item button
    And Confirmation message "Артикулът е добавен успешно." should be seen
    Examples:
      | itemName | price | quantity |
      | Таблет   | 1000  | 5        |
      | Телевизор| 2000  | 5        |
      | Компютър | 3000  | 10       |


