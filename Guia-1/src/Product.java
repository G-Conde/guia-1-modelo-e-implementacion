/*3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado*/

public class Product {
    private String identifier;
    private String description;
    private Integer quantity;
    private Double price;

    public Product() {
    }

    public Product(String identifier, String description, Integer quantity, Double price) {
        this.identifier = identifier;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double totalCost(Integer quantityItem) {
        return quantityItem * getPrice();
    }

    public void seeProduct() {
        double totalPrice = totalCost(getQuantity());
        System.out.println("Item Venta[id=" + getIdentifier() + ", descripcion=" + getDescription() + ", cantidad=" + getQuantity() + " ,pUnitario=" + getPrice() + ", pTotal=" + totalPrice + "]");
    }


}

