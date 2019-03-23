/*
* TypicalTestCases------>TypicalTests
*
* TypicalTests--------> ConvertAddress,ConvertAddressValues
*
* ConvertAddress------>AddressProvider
*
* ConvertAddressValues-----> Enums
*
* TypicalTestCases, TypicalTests contains different tests
*
* ConvertAddressValues used to select different addresses
*
* ConvertAddress calls AddressProvider
*
* AddressProvider converts the string address to JSON format
*
* Enums contains list of different string addresses
*
* */


package com.friday.qa.automat;

import com.friday.qa.automat.testcases.TypicalTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TypicalTestCases {

    private  final  TypicalTests typicalTests = new TypicalTests();


    @Test(groups = {"Simple Cases"})
    public void solveConvertAddress_1Success() {

        typicalTests.solveConvertAddress_1Success();

    }

    @Test(groups = {"Simple Cases"})
    public void solveConvertAddress_2Success() {

        typicalTests.solveConvertAddress_2Success();

    }

    @Test(groups = {"Simple Cases"})
    public void solveConvertAddress_3Success() {

        typicalTests.solveConvertAddress_3Success();

    }

    @Test(groups = {"Complicated Cases"})
    public void solveConvertAddress_4Success() {

        typicalTests.solveConvertAddress_4Success();

    }

    @Test(groups = {"Complicated Cases"})
    public void solveConvertAddress_5Success() {

        typicalTests.solveConvertAddress_5Success();

    }


    @Test(groups = {"Complex Cases"})
    public void solveConvertAddress_6Success() {

        typicalTests.solveConvertAddress_6Success();

    }


    @Test(groups = {"Complex Cases"})
    public void solveConvertAddress_7Success() {

        typicalTests.solveConvertAddress_7Success();

    }

    @Test(groups = {"Complex Cases"})
    public void solveConvertAddress_8Success() {

        typicalTests.solveConvertAddress_8Success();

    }

    @Test(groups = {"Complex Cases"})
    public void solveConvertAddress_9Success() {

        typicalTests.solveConvertAddress_9Success();

    }

    @DataProvider(name = "dataprovider")
    public Object[] readData() {

        return new Object[]{"Winterallee 3", "Musterstrasse 45", "Blaufeldweg 123B",
                "Am Bächle 23", "Auf der Vogelwiese 23 b", "4, rue de la revolution",
                "Calle Aduana, 29", "200 Broadway Av", "Calle 39 No 1540"};
    }

    @Test(dataProvider = "dataprovider")
    public void solveConvertAddress_10Success(String address) {

        typicalTests.solveConvertAddress_10Success(address);

    }

}