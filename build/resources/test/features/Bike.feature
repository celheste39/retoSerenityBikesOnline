Feature: SQA-C39 Pagina de Ciclas
  Yo como usuario de bikesonline, quiero ir al buscador y buscar
  unas bicicletas, despues de ello seleccionarlas y validar
  los productos por precio correctamente.

  Scenario Outline: <Escenario> <Modelos>
    Given que me encuentro en la pagina de bikesonline <Url>
    When busco diferentes modelos de ciclas <Modelos> en el buscador
    Then podre ver los modelos <Modelos> buscados con su precio respectivo

    Examples:
      | Escenario                                            | Modelos                                                | Url                          |
      | Buscar palabra en el buscador de Bikesonline exitoso | 2021 Polygon Siskiu D7 - Dual Suspension Mountain Bike | https://www.bikesonline.com/ |
      | Buscar palabra en el buscador de Bikesonline exitoso | 2021 Polygon Cascade 3 Red - 27.5 inch Mountain Bike   | https://www.bikesonline.com/ |
      | Buscar palabra en el buscador de Bikesonline exitoso | 2021 Polygon Trid ZZ Slopestyle / Dirt Jump Bike       | https://www.bikesonline.com/ |
      | Buscar palabra en el buscador de Bikesonline exitoso | 2021 Polygon Heist X2                                  | https://www.bikesonline.com/ |
      | Buscar palabra en el buscador de Bikesonline exitoso | 2021 Polygon Premier Ultralight 24 inch Kids Bike      | https://www.bikesonline.com/ |