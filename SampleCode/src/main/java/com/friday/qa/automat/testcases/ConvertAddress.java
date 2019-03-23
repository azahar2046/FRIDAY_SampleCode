package com.friday.qa.automat.testcases;

import com.friday.qa.automat.common.AddressProvider;
import com.friday.qa.automat.values.ConvertAddressValues;
import org.json.JSONObject;
import org.testng.Assert;

public class ConvertAddress extends  AddressProvider{

    private String street;

    private String house_number;

    private void fill(String address){

        JSONObject jsonObject = convertToJSON(address);

        street = jsonObject.getString("street");

        house_number = jsonObject.getString("housenumber");

    }

    public void success(ConvertAddressValues convertAddressValues){

        try {

            fill(convertAddressValues.getAddressData());

            Assert.assertTrue(convertAddressValues.getAddressData().contains(street));

            Assert.assertTrue(convertAddressValues.getAddressData().contains(house_number));

        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    public void success(String address){

        try {

            fill(address);

            Assert.assertTrue(address.contains(street));

            Assert.assertTrue(address.contains(house_number));

        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    public void failure(){
        /*
        Negative cases
        */
    }
}
