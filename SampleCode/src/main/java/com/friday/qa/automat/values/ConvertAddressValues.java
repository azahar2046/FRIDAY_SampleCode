package com.friday.qa.automat.values;

import com.friday.qa.automat.common.Enums;
import com.friday.qa.automat.common.Enums.AddressData;

public class ConvertAddressValues {

    private AddressData AddressData;

    public ConvertAddressValues() {

        this.AddressData = Enums.AddressData.Address_1;
    }

    public String getAddressData() {

        return AddressData.getVisibleText();
    }

    public void setAddressData(AddressData addressData) {

        AddressData = addressData;
    }

    @Override
    public String toString()
    {
        return "AddressData='" + AddressData + "'";
    }
}
