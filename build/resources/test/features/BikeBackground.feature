Feature: SQA-C39 Pagina de Ciclas
  Yo como usuario de bikesonline, quiero ir al buscador y buscar
  unas bicicletas, despues de ello seleccionarlas y validar
  los productos por precio correctamente.

  Background:
    Given que me encuentro en la pagina de bikesonline https://www.bikesonline.com/

  Scenario: Buscar palabra en el buscador de Bikesonline exitoso
    When busco varios modelos de ciclas en el buscador
      | nombreModelos         |
      | 2021 Polygon Heist X2 |
    Then podre ver unos modelos buscados con su precio respectivo

  Scenario: Buscar palabra en el buscador de Bikesonline exitoso
    When busco varios modelos de ciclas en el buscador
      | nombreModelos                                          |
      | 2021 Polygon Siskiu D7 - Dual Suspension Mountain Bike |
    Then podre ver unos modelos buscados con su precio respectivo