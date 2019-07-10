package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.model.AdministrativeRegion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionServiceTest {

    @Autowired
    RegionService service;
    @Test
    public void getRegionRootNameById() {
        AdministrativeRegion region = new AdministrativeRegion();
        region.setArNum("1263");

        List<AdministrativeRegion> list = service.getRegionRootNameById(region);
        List<String> stringList = list.stream()
                .map(AdministrativeRegion::getArName)
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
    }
}