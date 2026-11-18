public class Product implements IProduct {
    
    private String[] products;
    private int[] sales;
    
    //Constructor
    public Product(String[] product, int[] sales) {
        this.products = products;
        this.sales = sales;
    }
    
    //Calculate total peoduct sold
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        
        for(int i=0; i< sales.length; i++) {
            
            for(int j=0; j< sales[i].length; j++) {
                
                total += sales[i][j];
            }
        }
        return total;
    }
    
    //Calculate average products sold
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        int numberOfSales = sales.length * sales[0].length;
        
        return (double) total / count;
    }
    
    //Determine the most Popular product
    @Override
    public String GetMostPopularProduct() {
        
        int highestTotal = 0;
        String popularProduct = "";
        
        for(int j = 0; j< sales[i].length; j++) {
            
            productTotal += sales[i][j];
        }
        
        if (productTotal > highestTotal) {
            highestTotal = productTotal;
            popularProduct = products[i];
        }
    }
    
     return popularProduct + "(" + highestTotal + ")";
      
    }
