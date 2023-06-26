@Test
Feature: Probar Mercado Libre

Scenario: Compra sin Usuario
    Given Navego al inicio de ML
    When Clickeo el primer articulo recomendado
    And Clickeo en comprar
    Then Compruebo msj ¡Hola! Para comprar, ingresá a tu cuenta

