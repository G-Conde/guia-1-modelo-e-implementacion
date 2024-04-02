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
        Empleado empl1 = new Empleado(23456345,"Carlos","Gutierrez",25000.0);
        Empleado empl2 = new Empleado(34234123,"Ana","Sanchez",27500.0);

        empl1.employe();
        empl2.employe();
        empl1.salaryIncrease(15.0);
        System.out.println("El salario con el aumento es " + empl1.getSalary());
        System.out.println("El salario Anual de "+empl1.getName()+" es "+empl1.salaryAtYear());
        empl1.employe();
    }
}