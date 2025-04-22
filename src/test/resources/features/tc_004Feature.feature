Feature: Validar descompresión automática de archivos comprimidos

  Scenario: Subir y descomprimir un archivo comprimido
    Given el usuario está en la página de carga de archivos
    When el usuario sube un archivo comprimido con múltiples documentos
    Then el sistema debe descomprimir el archivo
    And listar cada documento para su validación