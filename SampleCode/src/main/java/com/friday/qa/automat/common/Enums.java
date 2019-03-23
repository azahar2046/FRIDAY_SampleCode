package com.friday.qa.automat.common;

public class Enums {

    public enum AddressData {

        Address_1("Winterallee 3"),
        Address_2("Musterstrasse 45"),
        Address_3("Blaufeldweg 123B"),
        Address_4("Am Bächle 23"),
        Address_5("Auf der Vogelwiese 23 b"),
        Address_6("4, rue de la revolution"),
        Address_7("Calle Aduana, 29"),
        Address_8("200 Broadway Av"),
        Address_9("Calle 39 No 1540");

        private final String visibleText;

        private AddressData(String visibleText) {

            this.visibleText = visibleText;
        }

        public String getVisibleText() {

            return visibleText;
        }
    }

}
