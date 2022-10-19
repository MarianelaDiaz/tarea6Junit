import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmpleadoTest {
    private Empleado empleado = new Empleado();

    @Test
    public void calcularSueldoBrutoTest() {
        float result = empleado.calcularSueldoBruto(5, 1200);
        assertEquals(1200, result);

    }

    @Test
    public void calcularSueldoBrutoConVentasMayorA2000Test() {
        float result = empleado.calcularSueldoBruto(6, 2100);
        assertEquals(1270, result);
    }

    @Test
    public void calcularSueldoNetoTest() {
        float result = empleado.calcularSueldoNeto(1200);
        assertEquals(1056, result);
    }

    @Test
    public void calcularSueldoNetoconBrutoMayora2000test() {
        float result = empleado.calcularSueldoNeto(2500);
        assertEquals(2100, result);
    }

    @Test
    public void tieneVacacionesTest() {
        boolean result = empleado.tieneVacaciones(10);
        assertTrue(result);
    }

    @Test
    public void tieneVacacionesConMenorA6MesesTest() {
        boolean result = empleado.tieneVacaciones(2);
        assertFalse(result);
    }
}
