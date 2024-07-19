
@Compra
Feature: Realizar compra de producto

  Scenario Outline: Realizar compra de producto en la pagina product store
    Given Deseo realizar una compra en la pagina de product store
    When Selecciono la <categories> y el <product> deseado
    And Agrego el producto al cart
    And Continuo con la compra y diligencio mi informacion <name> <country> <city> <creditcart> <month> <year>
    Then Visualizo el popup de compra exitosa <message>

    Examples:
      | categories | product | name      | country  | city         | creditcart       | month | year | message                      |
      | Phones     | Samsung | Katerinne | Colombia | Medallo city | 5897623596251478 | 12    | 27   | Thank you for your purchase! |
      | Laptops    | Sony    | Katerinne | Colombia | Medallo city | 5897623596251478 | 12    | 27   | Thank you for your purchase! |

