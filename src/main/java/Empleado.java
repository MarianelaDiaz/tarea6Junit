public class Empleado {
    private float sueldo=1000;

    public float calcularSueldoBruto(float horasExtras, float ventas) {
        if (ventas > 1000 && ventas <= 2000) {
            sueldo = sueldo + 100;
        } else {
            if (ventas > 2000) {
                sueldo = sueldo + 150;
            }
        }
        sueldo=sueldo+horasExtras*20;
        return sueldo;
    }

    public float calcularSueldoNeto(float sueldoBruto){
        float sueldoNeto=0;
        if (sueldoBruto>1000 && sueldoBruto<=2000) {
            sueldoNeto= sueldoBruto - ((12 * sueldoBruto) / 100);
        }
        else {
            if (sueldoBruto>2000)
                sueldoNeto=sueldoBruto-((16*sueldoBruto)/100);
        }
        return sueldoNeto;
    }

    public boolean tieneVacaciones(int meses) {
        boolean vacaciones=false;
        if (meses>6){
            vacaciones=true;
        }
        return vacaciones;
    }
}