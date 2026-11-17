
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidarRegistroTest {

    @Test
    public void registroValido_debeSerAprobado() {
        int edad = 25;
        boolean tieneDocumento = true;
        String clave = "Segura123";

        String resultado = ValidarRegistro.validarRegistro(edad, tieneDocumento, clave);

        assertEquals("REGISTRO APROBADO", resultado);
    }

    @Test
    public void registroInvalido_debeSerRechazado() {
        int edad = 15;
        boolean tieneDocumento = false;
        String clave = "123";

        String resultado = ValidarRegistro.validarRegistro(edad, tieneDocumento, clave);

        assertEquals("REGISTRO RECHAZADO", resultado);
    }
}
