package com.friday.qa.automat.testcases;

import com.friday.qa.automat.common.Enums.AddressData;
import com.friday.qa.automat.values.ConvertAddressValues;

public class TypicalTests {

    public void solveConvertAddress_1Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_2Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_2);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_3Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_3);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }

    public void solveConvertAddress_4Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_4);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_5Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_5);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }

    public void solveConvertAddress_6Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_6);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }

    public void solveConvertAddress_7Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_7);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_8Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_8);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_9Success() {

        ConvertAddressValues convertAddressValues = new ConvertAddressValues();

        convertAddressValues.setAddressData(AddressData.Address_9);

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(convertAddressValues);

    }


    public void solveConvertAddress_10Success(String address) {

        ConvertAddress convertAddress = new ConvertAddress();

        convertAddress.success(address);

    }

}
