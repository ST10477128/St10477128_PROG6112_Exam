class PrintProduct {
    
    private Product product;
        
        public PrintProduct(Product product) {
            this.product = product;
        }
        
        public void PrintTotalSales() {
            System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductSold());
        }
        
        public void PrintAverageSales() {
            System.out.printf("AVERAGE PRODUCT SALES: %.0f%n" , product.GetAverageProductSold());
        }
        
        public void PrintMostPopularProduct() {
            System.out.println("MOST POPULAR PRODUCT : " + product.GetMostPpopularProduct());
        }
    
 }