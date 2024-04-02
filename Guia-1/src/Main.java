public class Main {
    public static void main(String[] args) {
        /*Rectangle rect= new Rectangle(1.0,1.0);

        System.out.println("Altura = " + rect.getHeight());
        System.out.println("Ancho = " + rect.getWidth());

        rect.setHeight(5.0);
        rect.setWidth(6.0);

        System.out.println("Altura = " + rect.getHeight());
        System.out.println("Ancho = " + rect.getWidth());

        System.out.println("Perimetro =" + rect.perimeter());
        System.out.println("Area =" + rect.area());
*/
        Employee empl1 = new Employee(23456345,"Carlos","Gutierrez",25000.0);
        Employee empl2 = new Employee(34234123,"Ana","Sanchez",27500.0);

        empl1.employee();
        empl2.employee();
        empl1.salaryIncrease(15.0);
        System.out.println("El salario con el aumento es " + empl1.getSalary());
        System.out.println("El salario Anual de "+empl1.getName()+" es "+empl1.salaryAtYear());
        empl1.employee();
    }
}