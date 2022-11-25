package j14_스태틱.빌더;

public class ProductMain {
    public static void main(String[] args) {

        Product product = Product.builder()
                .productCode(5454)
                .productName("dd")
                .price(444)
                .stock(111)
                .build();
    }
}
