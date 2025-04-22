Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo válido y mostrar vista previa
    Given el usuario está en la página de carga de archivos
    When el usuario selecciona un archivo PDF/DOCX dentro del límite de 50 MB
    Then el archivo se carga exitosamente
    And se muestra la vista previa del archivo con nombre, tamaño y tipo