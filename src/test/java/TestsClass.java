public class TestsClass extends Preconditions {

//    @Test
    public static void canPrintCustomerId() {
        Preconditions td = new Preconditions();
        provideTestData(td, "a customer");

        // open browser and do some actions using the data created in preconditions

        System.out.println("customer ID: <" + td.customerId + ">");
    }

//    @Test
    public static void canCreateProduct() {
        Preconditions td = new Preconditions();
        provideTestData(td, "a product");

        // open browser and do some actions using the data created in preconditions

        System.out.println("product ID: <" + td.productId + ">");
    }

//    @Test
    public static void canGetCustomerIdFromDiffTest() {
        Preconditions td = new Preconditions();
        provideTestData(td, "a sku");

        System.out.println("cart refNum: <" + td.cartRefNum + ">");
        if (td.cartRefNum == null) {
            System.out.println("result: PASS");
        } else {
            System.out.println(td.cartRefNum);
            System.out.println("result: FAIL");
        }

    }

    public static void main(String[] args) {
        canPrintCustomerId();
        canCreateProduct();
        canGetCustomerIdFromDiffTest();
    }

}
