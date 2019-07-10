package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.AdministrativeRegion;
import com.fhamster.dolldrobe.model.ShippingAddress;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.AddressService;
import com.fhamster.dolldrobe.service.RegionService;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController {

    @Autowired
    AddressService service;

    @Autowired
    RegionService regService;

    @GetMapping("/Address")
    @UserLoginToken
    public List<ShippingAddress> getAddress(
            HttpServletRequest request
    ) {
        User user = (User) request.getAttribute("user");

        List<ShippingAddress> addressList = service.getAddress(user);

        ShippingAddress addressTmp;
        for (int i = 0; i < addressList.size(); i++) {

            addressTmp = addressList.get(i);
            String str = regService.getRegionRootNameById(addressTmp.getArNum());
            addressTmp.setArNum(str);
        }


        addressList.forEach(System.out::println);
        return addressList;
    }

    @PostMapping("/Address")
    @UserLoginToken
    public void addAddress(
            @RequestBody ShippingAddress address,
            HttpServletRequest request
    ) {
        User user = (User) request.getAttribute("user");
        address.setuAccountnumber(user.getuAccountnumber());

        service.addAddress(address);
    }

}
