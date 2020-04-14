class SpecialOffer {
    Product product;
    String description;
    String periodOfTime;
    double discount;

    public SpecialOffer(Product product, String description, String periodOfTime, double discount) {
        this.product = product;
        this.description = description;
        this.periodOfTime = periodOfTime;
        this.discount = discount;
    }

    void ShowPromo(){
        System.out.println("Produkt:\t" + product.name +
                            "\nPromocja:\t" + description +
                            "\nObowiązuje:\t" + periodOfTime +
                            "\nCena w promocji:\t" + (product.price-(product.price*discount)));
    }
}
