Feature: SQA-C39 Pagina de Ciclas
  Yo como usuario de bikesonline, quiero ir al buscador y buscar
  unas bicicletas, despues de ello seleccionarlas y validar
  los productos por precio correctamente.

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de bikesonline <Url>
    When busco un modelo aleatorio de cicla en el buscador
    Then podre ver un modelo aleatorio buscado con su precio respectivo

    Examples:
      | Escenario                                            | Url                          |
      | Buscar palabra en el buscador de Bikesonline exitoso | https://www.bikesonline.com/ |