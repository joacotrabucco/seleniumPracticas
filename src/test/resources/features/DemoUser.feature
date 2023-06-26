@Test
Feature: Probar DemoGuruUser

Scenario: Ingresar con los usuarios correspondientes
    Given Navego al Url correcto
    When Pongo el usuario Correcto 
        And La contrasela Correcta
        And Press the login button
    Then Compruebo el msj de loggeo
