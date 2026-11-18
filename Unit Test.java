class ProductTest {

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        String[] products = {

            "Cozy Nights Monarch",

            "Restonic Barbados",

            "Sealy Phuket"

        };

        int[][] sales = {

            {25, 18, 20},

            {15, 10, 12},

            {18, 15, 20}

        };

        Product product = new Product(products, sales);

        if (product.GetTotalProductsSold() != 153) {

            throw new AssertionError("Unit Test 1 FAILED");

        }

        System.out.println("Unit Test 1 PASSED");

    }

    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        String[] products = {

            "Cozy Nights Monarch",

            "Restonic Barbados",

            "Sealy Phuket"

        };

        int[][] sales = {

            {25, 18, 20},

            {15, 10, 12},

            {18, 15, 20}

        };

        Product product = new Product(products, sales);

        if (Math.abs(product.GetAverageProductSold() - 17.0) > 0.001) {

            throw new AssertionError("Unit Test 2 FAILED");

        }

        System.out.println("Unit Test 2 PASSED");

    }

}
