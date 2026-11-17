public class ValidarRegistro {

    public static String validarRegistro(int edad, boolean tieneDocumento, String clave) {
        boolean datosPersonalesOk = false;
        boolean claveOk = false;

        // Decision D1 (condicion compuesta)
        if (edad >= 18 && tieneDocumento) {
            datosPersonalesOk = true;
        }

        // Decision D2 (condicion compuesta)
        if (clave != null && clave.length() >= 8) {
            claveOk = true;
        }

        // Decision D3
        if (datosPersonalesOk && claveOk) {
            return "REGISTRO APROBADO";
        } else {
            return "REGISTRO RECHAZADO";
        }
    }
}
