public class Preconditions extends ApiCallMethods {

    public static Preconditions provideTestData(Preconditions testData, String testDataDescription) {

        System.out.println("==== ==== ==== ==== ");
        Preconditions td = testData;

        switch (testDataDescription) {
            case "a customer":
                createCustomer(td);
                break;

            case "a cart":
                createCustomer(td);
                createCart(td, td.customerId);
                break;

            case "a sku":
                createSKU(td);
                break;

            case "a product":
                createSKU(td);
                createProduct(td, td.skuCode);
                break;

        }

        return td;
    }

}
