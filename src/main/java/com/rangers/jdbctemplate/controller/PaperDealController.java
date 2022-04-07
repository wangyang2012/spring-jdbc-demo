package com.rangers.jdbctemplate.controller;

import com.rangers.jdbctemplate.model.PaperDeal;
import com.rangers.jdbctemplate.service.IPaperDealService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deals")
public class PaperDealController {

  @Autowired
  private IPaperDealService paperDealService;

  @GetMapping()
  public List<PaperDeal> getDeals() {
    return paperDealService.getPaperDeals();
  }

  @GetMapping(value="/{cdSite}/{cdDeal}")
  public PaperDeal getDealByCdDeal(@PathVariable Integer cdSite, @PathVariable Integer cdDeal) {
    return paperDealService.getPaperDeal(cdSite, cdDeal);
  }

}
