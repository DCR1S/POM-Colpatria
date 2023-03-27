#language: es
  Característica: Web Tables, DataPickers, Alerts Frames & Windows
    @RegistroYEliminacion
    Escenario: registro formulario en web btables

      Dado que estoy en la pagina de demoqa web tables
      Cuando llene todos los campos requeridos
      Entonces visualizo en la tabla el nuevo usuario
      Y quiera eliminar un registro existente

    @DatePicker
    Escenario: Registrar Fecha y Hora

      Dado que estoy en la pagina de demoqa datepicker
      Cuando llene todos los campos requeridos para fecha y hora
      Entonces visualizo la fecha o hora en el input


    @AlertsFramesAndWindows
    Escenario: Activar y cerrar ventanas

      Dado que estoy en la pagina de demoqa Alerts, Frames y Windows
      Cuando active las alertas y las cierre
      Entonces visualizo que no haya ningun aviso y/o alerta presentes

