Feature: Consulta en Google 

@ejecucion2
  Scenario: Realizar consulta exitosa en el navegador de google
    Given que el usuario se encuentra en la pagina inicial del buscador de google
    When  consulta el tema deseado 
    Then puede visualizar los resultados de la busqueda 