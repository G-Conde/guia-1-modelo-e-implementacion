/*2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
anual. A su vez se requiere otro método que permita aumentar el salario
dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la
siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.

*/
public class Employee {
    private Integer dni;
    private String name;
    private String lastName;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer dni, String name, String lastName, Double salary) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Double salaryAtYear() {
        return salary * 12;
    }
    public void salaryIncrease(Double percent) {
        this.salary = ((this.salary *percent)/100)+this.salary;
    }
    public void employee() {
        System.out.println("[DNI=" + getDni()+", "+ "Empleado=" + getName()+", "+ "Apellido=" + getLastName()+", "+ "Salario=" + getSalary() + "]");
    }
}
