class TestOffers {
    public static void main(String[] args) {

        Category slodycze = new Category("Ciastka", "Z czekoladą");

        Product delicje = new Product("Delicje", 2.50, "Malinowe", slodycze);
        Product jezyki = new Product("Jeżyki", 2.80, "Classic", slodycze);
        Product paluszki = new Product("Paluszki", 3.10, "słone", null);

        SpecialOffer ofertaSpecjalna = new SpecialOffer(delicje, "Delicjopromocja 20% taniej!", "Od kwietnia do maja 2020 roku", 0.20);

        delicje.productInfo();
        System.out.println("Kategoria:\t" + delicje.category.name);
        jezyki.productInfo();
        System.out.println("Kategoria:\t" + jezyki.category.name);
        paluszki.productInfo();

        ofertaSpecjalna.ShowPromo();
    }
}
