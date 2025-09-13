/*Atributos: 
● int id: Identificador único del empleado. 
● String nombre: Nombre completo. 
● String puesto: Cargo que desempeña. 
● double salario: Salario actual. 
● static int totalEmpleados: Contador global de empleados creados.

REQUERIMIENTOS 
1. Uso de this: 
○ Utilizar this en los constructores para distinguir parámetros de 
atributos. 
2. Constructores sobrecargados: 
○ Uno que reciba todos los atributos como parámetros. 
○ Otro que reciba solo nombre y puesto, asignando un id 
automático y un salario por defecto. 
○ Ambos deben incrementar totalEmpleados. 
3. Métodos sobrecargados actualizarSalario: 
○ Uno que reciba un porcentaje de aumento. 
○ Otro que reciba una cantidad fija a aumentar. 
4. Método toString(): 
○ Mostrar id, nombre, puesto y salario de forma legible. 
5. Método estático mostrarTotalEmpleados(): 
○ Retornar el total de empleados creados hasta el momento. 
6. Encapsulamiento en los atributos: 
○ Restringir el acceso directo a los atributos de la clase. 
○ Crear los métodos Getters y Setters correspondientes.
 
 */
package tp4.poo;


public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados; //contado de empleados-Variable de clase
    private static int idAutoIncremental=1;
   
    
    //Constructores
   
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++ ; //incrementa empleados
    }

    public Empleado(String nombre, String puesto) {
        idAutoIncremental ++;
        this.id = idAutoIncremental ++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2500; //salario por defecto
        totalEmpleados++;
        
    }
    
    //metodos
    public double actualizarSalario(int porcentaje){
        double actualizacion = salario*(porcentaje/100.0);
        return salario += actualizacion;
    }
    public double actualizarSalario(double montoFijo){
        return salario += montoFijo;
    }
    

    @Override
    public String toString() { 
    return "Empleado{" +      
           "id=" + id +
           ", nombre='" + nombre + '\'' +
           ", puesto='" + puesto + '\'' +
           ", salario=" + salario +
           '}';  
   }
    
    //metodo static
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) { 
        this.salario = salario;
    }

       
     //Getters
    public int getId(){
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
    return nombre;
}

    public String getPuesto() {
        return puesto;
    }
    
}

    
