Feature: Validar manejo de archivo con formato no permitido o tamaño excedido

  Scenario: Intentar subir un archivo con formato no permitido o tamaño superior a 50 MB
    Given Estoy en la página de carga de archivos
    When Intento subir un archivo con formato no permitido o tamaño mayor a 50 MB
    Then Veo un mensaje de error indicando formato inválido o tamaño excedido