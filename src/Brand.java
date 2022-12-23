public class Brand {
    private final String brand;
    private final String country;
    private final String language;

    public Brand(String brand, String country, String language){
        this.brand = brand;
        this.country = country;
        this.language = language;
    }

    public String getBrand() {return brand;}
    public String getCountry() {return country;}
    public String getLanguage() {return language;}

    public String toString() {
        return "Brand [brand= " + brand + ", country= " + country + ", language= " + language + "]";
    }
}
