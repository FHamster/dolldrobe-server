package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.AdministrativeRegion;
import com.fhamster.dolldrobe.service.RegionService;
import com.fhamster.dolldrobe.util.PassToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Region")
public class RegionController {

    @Autowired
    RegionService service;

    @GetMapping("/RegionByParent/{ParentId}")
    @PassToken
    public List<AdministrativeRegion> getRegionByParent(
            @PathVariable("ParentId") String ParentId
    ) {


        AdministrativeRegion region = new AdministrativeRegion();
        region.setArNum(ParentId);

        //TODO 算法优化
        return service.getRegionByPrentId(region);
    }

    @GetMapping("/RegionName")
    @PassToken
    public String getRegionRoot(
            @RequestParam String RegionId
    ) {

        AdministrativeRegion region = new AdministrativeRegion();
        region.setArNum(RegionId);

        String strings = service.getRegionRootNameById(RegionId);

//
        System.out.println(strings);

        return strings;
    }

}
