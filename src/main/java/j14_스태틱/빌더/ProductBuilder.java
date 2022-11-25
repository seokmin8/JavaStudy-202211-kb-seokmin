package j14_스태틱.빌더;
/*
    기존 Product의 static class를 밖으로 빼낸거랑 같은 클래스
    (주석처리 해놓음)
 */
public class ProductBuilder {
    private int productCode;
    private String productName;
    private int price;
    private int stock;

    public ProductBuilder productCode(int productCode){
        this.productCode = productCode;
        return this;
    }
    public ProductBuilder productName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder price(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder stock(int stock) {
        this.stock = stock;
        return this;
    }
    public Product build(){
        return new Product(productCode, productName, price, stock);
    }
}
