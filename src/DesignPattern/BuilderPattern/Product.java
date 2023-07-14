package DesignPattern.BuilderPattern;

public class Product {

    private String property1;
    private String property2;
    private int property3;

    private Product(){

    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public int getProperty3() {
        return property3;
    }

    static class Builder {

        private String property1;
        private String property2;
        private int property3;

        public Builder setProperty1(String property1) {
            this.property1 = property1;
            return this;
        }

        public Builder setProperty2(String property1, String property2) {
            this.property1 = property1;
            this.property2 = property2;
            return this;
        }

        public void setProperty3(int property3) {
            this.property3 = property3;
        }

        public Product build() {
            Product product = new Product();
            product.property1 = this.property1;
            product.property2 = this.property2;
            product.property3 = this.property3;
            return product;
        }

    }


}
