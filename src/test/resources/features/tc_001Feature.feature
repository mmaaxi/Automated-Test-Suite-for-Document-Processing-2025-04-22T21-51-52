Feature: Validar selección de modo de carga de documentos

  Scenario: Seleccionar y validar modos de carga de documentos
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona la opción 'cargar documentos'
    Then El sistema muestra la opción para carga única y carga múltiple
    
    When El usuario elige 'carga en un solo archivo'
    Then Se habilita un único recuadro para subir el archivo
    
    When El usuario elige 'cargar documentos por separado'
    Then Se muestran múltiples recuadros correspondientes a cada documento requerido