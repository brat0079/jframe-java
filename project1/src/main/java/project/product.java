package project;

//atribut / field
public class product {
    private int ProductID;
    private String ProductName;
    private double Price;
    private int Qty;

    // Contractor Kelas
    public product() {
        this.ProductID = 0;
        this.ProductName = "Aqua Botol";
        this.Price = 5000;
        this.Qty = 3;
    }

    // getter
    public int getProductID() {
        return this.ProductID;
    }
    
    //setter
        private void setProductID(int ProductID) {
        this.ProductID = 0;

}
    // getter
    public String getProductName() {
        return this.ProductName;
    }
    
    //setter
     private void setProductName(String ProductName) {
        this.ProductName = "Aqua Botol";

}
     // getter
    public double getPrice() {
        return this.Price;
    }
    
    //setter
     private void setPrice(double Price) {
        this.Price = 5000;

}
     // getter
    public int getQty() {
        return this.Qty;
    }
    
    //setter
     private void setQty(int Qty) {
        this.Qty = 3;

}

    void print(){
        System.out.println ("ProductID : " + this.ProductID);
        System.out.println ("ProductName : " + this.ProductName);
        System.out.println ("price : " + this.Price);
        System.out.println ("Quantity : " + this.Qty);
    }
    
    public static void main(String[] args) {
        product tbarang = new product();

        tbarang.getProductID();
        tbarang.print();
    }

}