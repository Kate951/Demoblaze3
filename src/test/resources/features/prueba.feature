
@CreacionUsuario
Feature: Realizar registro de usuario nuevo

  Scenario Outline: Realizar registro en la pagina product store
    Given Deseo realizar el registro de un usuario en la pagina de product store
    When Realizo registro de usuario con <user> y <password>
    And Realizo logueo de usuario con <user> y <password>
    Then Visualizo el nombre de usuario <user>

    Examples:
      | user       | password   |
      | Katerinne7 | Katerinne7 |


