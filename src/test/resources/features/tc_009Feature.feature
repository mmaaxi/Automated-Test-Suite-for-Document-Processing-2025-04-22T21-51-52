Feature: Validar rendimiento en la carga de archivos de diferentes tamaños

  Scenario: Cargar archivos pequeños y medir tiempo de respuesta
    Given el usuario está en la página de carga de archivos
    When el usuario sube un archivo de tamaño 3 MB
    Then el archivo debería cargarse y procesarse en menos de 2 segundos
    When el usuario sube un archivo de tamaño 6 MB
    Then el archivo debería cargarse y procesarse en menos de 2 segundos
    When el usuario mide el tiempo de respuesta desde la selección hasta la vista previa
    Then el tiempo de respuesta debería ser inferior a 1 segundo para archivos pequeños