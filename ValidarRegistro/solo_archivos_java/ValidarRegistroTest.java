import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidarRegistroTest {

    // Camino: D1 = V, D2 = V, D3 = V
    @Test
    public void registroValido_debeSerAprobado() {
        // Arrange
        int edad = 25;
        boolean tieneDocumento = true;
        String clave = "Segura123";

        // Act
        String resultado = ValidarRegistro.validarRegistro(edad, tieneDocumento, clave);

        // Assert
        assertEquals("REGISTRO APROBADO", resultado);
    }

    // Camino: D1 = F, D2 = F, D3 = F
    @Test
    public void registroInvalido_debeSerRechazado() {
        // Arrange
        int edad = 15;
        boolean tieneDocumento = false;
        String clave = "123";

        // Act
        String resultado = ValidarRegistro.validarRegistro(edad, tieneDocumento, clave);

        // Assert
        assertEquals("REGISTRO RECHAZADO", resultado);
    }
}
