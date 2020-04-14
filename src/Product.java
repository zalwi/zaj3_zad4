class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    void productInfo(){
        System.out.println("Nazwa:\t" + name +
                            "\nOpis:\t" + description +
                            "\nCena:\t" + price);
    }
}
