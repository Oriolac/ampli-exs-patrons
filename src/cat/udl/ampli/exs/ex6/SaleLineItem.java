package cat.udl.ampli.exs.ex6;

public class SaleLineItem {

    private final int quantity;
    private final ProductDescription desc;

    public SaleLineItem(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal() {
        return desc.getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductDescription getDesc() {
        return desc;
    }
}
