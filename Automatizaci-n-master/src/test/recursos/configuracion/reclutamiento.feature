  # language: es
 Feature: Automatización de Reclutamiento en OrangeHRM

    Scenario: Añadir un nuevo candidato y verificar el proceso de contratación
  Dado que el usuario está en la página de inicio de sesión de OrangeHRM
  Cuando el usuario inicia sesión con credenciales válidas
  Y navega a la funcionalidad de "Reclutamiento"
  Y hace clic en el botón "Añadir"
  Y completa los detalles del candidato
  Y envía la información del candidato
  Entonces los detalles del candidato deben coincidir con la información ingresada
  Y el estado del candidato debe ser "Contratado"