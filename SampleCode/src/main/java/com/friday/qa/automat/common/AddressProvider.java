package com.friday.qa.automat.common;

import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressProvider {

    private String street;

    private String house_number;

    private String checkRegex(String regexText, String text) {

        String value = null;

        Pattern pattern = Pattern.compile(regexText);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            if (matcher.group().length() != 0) {

                value = matcher.group().trim();
            }
        }

        return value;
    }

    private void getData(String address) {

        String regex_1 = "([^\\s])([a-zA-ZÖÜÄöüä]{2,10})\\s([0-9]{1,5})";

        String regex_2 = "([a-zA-ZÖÜÄöüä]{2,10})\\s?([a-zA-ZÖÜÄöüä]{2,10})\\s?([a-zA-ZÖÜÄöüä]{2,10})\\s?([a-zA-ZÖÜÄöüä]{2,10})";

        String regex_3 = "([0-9]{1,5})\\s([a-zA-ZÖÜÄöüä]{2,10})\\s([0-9]{1,5})";

        String regex_4 = ",";

        String temp;

        if (Pattern.compile(regex_4).matcher(address).find()) {

            temp = address.replaceAll(regex_4, "");

            street = checkRegex(regex_2, temp).trim();

        } else if (Pattern.compile(regex_3).matcher(address).find()) {

            temp = address;

            street = checkRegex(regex_1, temp).trim();

        } else {

            temp = address;

            street = checkRegex(regex_2, temp).trim();

        }

        house_number = temp.replaceAll(street, "").trim();
    }

    public JSONObject convertToJSON(String address) {

        getData(address);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("street", street);

        jsonObject.put("housenumber", house_number);

        System.out.println("Street: " + street);

        System.out.println("House Number: " + house_number);

        System.out.println("JSON form:\n" + jsonObject.toString());

        return jsonObject;
    }

}