package com.example;

//         * Utwórz klase SearchSettings,
//        * która będzie przetrzymywać kryteria wyszukiwania ogłoszeń
//         * z odpowiednimi getterami i setterami dla pól:
//        * rocznik: od - do
//        * przebieg: od - do
//        * cena: od - do
//        * słowo w tytule
//         * data ogłoszenia: od - do
public class SearchSettings {
    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        this.year = newYear
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int newMileage) {
        this.Mileage = newMileage;
    }
    public int getPrice() {
        return Price;
    }

    public void setPrice(int newPrice) {
        this.Price = newPrice;
    }


}
