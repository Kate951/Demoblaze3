#Autor: Juan Diego Valencia Duque

@HistoriaDeUsuario
Feature: Loggearse en maxtime

  Scenario Outline: Realizar loggeo en maxtime
    Given Deseo loggearme en maxtime
    When Ingreso las credenciales <user> y <password>
    Then Visualizo los detalles de la cuenta <user>

    Examples:
      | user       | password       |
      | jvalenciad | Colpatria.JV25 |

