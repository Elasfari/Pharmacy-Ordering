import java.util.ArrayList;

public class Pharmacy {
    ArrayList<Drug> drugs = new ArrayList<Drug>();
    private int capacity;
    private static double totalSales;
    private int quantitySold;
    Pharmacy(){
        capacity = -1;
        totalSales = 0;
        quantitySold = 0;
    }
    Pharmacy(int Capacity){
        capacity = Capacity;
        totalSales = 0;
        quantitySold = 0;
    }
    public boolean addDrug(String name, int id, double price, String category, int quantity) {
        if (!checkId(id)) {
            if (capacity >= quantity) {
                Drug d1 = new Drug(name, id, price, category, quantity);
                drugs.add(d1);
                capacity -= quantity;
                System.out.println("Drug added successfully");
                return true;
            } else {
                System.out.println("Sorry, no capacity");
                return false;
            }
        }
        System.out.println("ID already exists, enter different id");
        return false;
    }

    public boolean removeDrug(int id) {
        for (Drug d : drugs) {
            if (d.getId() == id) {
                capacity += d.getQuantity();
                drugs.remove(d);
                System.out.println("Drug removed successfully");
                return true;
            }
        }
        return false;
    }

    public boolean checkId(int id) {
        for (Drug d : drugs) {
            if (d.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean placeOrder(int id) {
    for(Drug d : drugs){
        if(d.getId() == id){
            if(d.getCategory() == false && d.getQuantity() >= 1){
                totalSales = totalSales + d.getPrice();
                d.setQuantity(d.getQuantity()-1);
                quantitySold++;
                return true;
            }
            if(d.getCategory() == true && d.getQuantity() >= 1){
                totalSales = totalSales + d.getPrice() * 1.2;
                d.setQuantity(d.getQuantity()-1);
                quantitySold++;
                return true;
            }
        }
    }
    return false;
    }

    public String getTotalSales() {
        return "Total sales: " + totalSales + "\nTotal quantity sold:" + quantitySold;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int Capacity) {
        this.capacity = Capacity;
    }
}
