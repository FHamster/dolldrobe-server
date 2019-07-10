package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.AdministrativeRegion;
import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.FPageService;
import com.fhamster.dolldrobe.service.RegionService;
import com.fhamster.dolldrobe.util.PassToken;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Region")
public class RegionController {

    @Autowired
    RegionService service;

    @GetMapping("/RegionByParent")
    @PassToken
    public List<AdministrativeRegion> getRegionByParent(
            @RequestParam(required = true, defaultValue = "1") String ParentId
    ) {


        AdministrativeRegion region = new AdministrativeRegion();
        region.setArNum(ParentId);

        return service.getRegionByPrentId(region);
    }

    @GetMapping("/RegionName")
    @PassToken
    public String getRegionRoot(
            @RequestParam(required = true) String RegionId
    ) {

        AdministrativeRegion region = new AdministrativeRegion();
        region.setArNum(RegionId);

        String strings = service.getRegionRootNameById(RegionId);

//
        System.out.println(strings);

        return strings;
    }

}
