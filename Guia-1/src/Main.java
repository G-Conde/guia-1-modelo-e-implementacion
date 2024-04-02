public class Main {
    public static void main(String[] args) {
        Rectangle rect= new Rectangle(1.0,1.0);

        System.out.println("Altura = " + rect.getHeight());
        System.out.println("Ancho = " + rect.getWidth());

        rect.setHeight(5.0);
        rect.setWidth(6.0);

        System.out.println("Altura = " + rect.getHeight());
        System.out.println("Ancho = " + rect.getWidth());

        System.out.println("Perimetro =" + rect.perimeter());
        System.out.println("Area =" + rect.area());
    }
}