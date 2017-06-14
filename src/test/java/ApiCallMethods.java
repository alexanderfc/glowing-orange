public class ApiCallMethods extends TestData {

    public static Preconditions createCustomer(Preconditions td) {
        System.out.println("creating a customer");
        // calling the API to create a customer
        td.customerId = 1;
        return td;
    }

    public static Preconditions createCart(Preconditions td, int customerId) {
        System.out.println("rolling out a cart for customer <" + customerId + ">");
        // calling the API to create a cart
        td.cartRefNum = "BR12345";
        return td;
    }

    public static Preconditions createSKU(Preconditions td) {
        // calling the API to create a SKU
        td.skuCode = "TST-42";
        return td;
    }

    public static Preconditions createProduct(Preconditions td, String skuCode) {
        System.out.println("creating a product with a SKU <" + skuCode + ">");
        // calling the API to create a product
        td.productId = 42;
        return td;
    }

}
