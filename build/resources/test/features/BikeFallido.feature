Feature: SQA-C39 Pagina de Ciclas
  Yo como usuario de bikesonline, quiero ir al buscador y buscar
  unas bicicletas, despues de ello seleccionarlas y validar
  los productos por precio correctamente.

  Scenario: Buscar palabra en el buscador de Bikesonline exitoso
    Given que me encuentro en la pagina de bikesonline https://www.bikesonline.com/
    When busco ciertos modelos de ciclas en el buscador
      | nombreModelos         |
      | 2021 Polygon Heist X2 |
    Then podre ver modelos buscados con su precio respectivo

  Scenario: Buscar palabra en el buscador de Bikesonline fallido
    Given que me encuentro en la pagina de bikesonline https://www.bikesonline.com/
    When busco ciertos modelos de ciclas en el buscador
      | nombreModelos |
      | Navaja suiza  |
    Then podre ver modelos buscados con su precio respectivo