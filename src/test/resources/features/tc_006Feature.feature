Feature: Validar integración y procesamiento correcto de OCR y METIQ

  Scenario: Subir documentos estructurados y no estructurados
    Given El usuario está en la página de carga de documentos
    When El usuario sube un documento estructurado
    And El usuario sube un documento no estructurado
    Then El sistema procesa los documentos con OCR
    And El sistema extrae los datos correctamente
    And El sistema muestra la información para confirmación