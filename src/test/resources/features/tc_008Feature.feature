Feature: Validar usabilidad de la vista previa y funcionalidad de eliminación de archivos

  Scenario: Subir documentos y observar la vista previa
    Given que el usuario abre la aplicación de carga de archivos
    When el usuario sube el archivo "documento1.pdf"
    Then el sistema muestra el nombre "documento1.pdf", el tamaño y el tipo PDF del archivo

  Scenario: Eliminar uno de los archivos usando la opción de eliminar
    Given el archivo "documento1.pdf" fue subido
    When el usuario selecciona la opción de eliminar para el archivo "documento1.pdf"
    Then el archivo "documento1.pdf" se elimina correctamente de la lista antes de la confirmación