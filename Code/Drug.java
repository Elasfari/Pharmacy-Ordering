public class Drug {
    //Add drug name, id, price, category, available quantity
    private String name;
    private int id;
    private double price;
    private int category;
    private int quantity;

    Drug() {
        name = "\0";
        id = 0;
        price = 0;
        category = 0;
        quantity = 0;
    }

    Drug(String NAME, int ID, double PRICE, String CATEGORY, int QUANTITY) {
        name = NAME;
        id = ID;
        price = PRICE;
        if(CATEGORY == "cosmetics"){
            category = 2;
        }
        else {
            category = 1;
        }
        quantity = QUANTITY;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int Q) {
        this.quantity = Q;
    }

    public boolean getCategory() {
        if(this.category == 1){
            return false;
        }
        if(this.category == 2) {
            return true;
        }
        return false;
    }
}
