import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //Singlr-dimensional array 
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        //Two dimensional array 
        int[][] sales = new int[3][3];
        
        // Enter sales for each product
        for (int i = 0; i< products.length; i++) {
            for (int j =0; j<3; j++) {
                
                System.out.print("Enter number of sales for month " + (j + 1) +"for " + products[i] + "mattress: ");
                
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        //Create Product object
        Product product = new Product(products, sales);
        
        //Create productProduct object
        PrintProduct report = new PrintProduct(product);
        
        //Display Report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("***************************************");
      
        report.PrintTotalSales();
        report.PrintAverageSales();
        report.PrintMostPopularProduct();
        
        input.close();
    }
}