/*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.*/
public class BankClient {
    private static Integer id = 0;
    private String name;
    private Double balance;

    public BankClient(String name, Double balance) {
        this.id++;
        this.name = name;
        this.balance = balance;
    }

    public static Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double credit(Double cash) {
        return this.balance += cash;
    }

    public Double debit(Double cash) {
        if (cash > getBalance()) {
            System.out.println("Dinero insuficiente para realizar la operacion");
        } else {
            this.balance -= cash;
        }
        return this.balance;
    }

    public void seeClient() {
        System.out.println("[id=" + getId() + " ,Nombre=" + getName() + ", Balance=" + getBalance() + "$]");
    }
}
