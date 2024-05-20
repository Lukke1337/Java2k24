package com.example;

import java.util.List;

public class SearchByYearFilter {


    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }


    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    public List<CarOffer> getCarOffers() {
        return carOffers;
    }
}
