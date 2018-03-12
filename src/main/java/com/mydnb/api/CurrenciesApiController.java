package com.mydnb.api;

import com.mydnb.model.CurrencyRate;
import org.joda.time.LocalDate;
import java.math.BigDecimal;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class CurrenciesApiController implements CurrenciesApi {

    public ResponseEntity<CurrencyRate> currencyConvert(
@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true ) @PathVariable("base") String base


,
        
@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true ) @PathVariable("currency") String currency


,
        
@ApiParam(value = "",required=true ) @PathVariable("amount") BigDecimal amount


,
        @ApiParam(value = "End of day rate.") @RequestParam(value = "date", required = false) LocalDate date



) {
        // do some magic!
        return new ResponseEntity<CurrencyRate>(HttpStatus.OK);
    }

    public ResponseEntity<List<CurrencyRate>> currencyList(
@ApiParam(value = "\"Home\" currency. ISO 4217: alpha 3-letter upcase",required=true ) @PathVariable("base") String base


,
        @ApiParam(value = "End of day rate.") @RequestParam(value = "date", required = false) String date



) {
        // do some magic!
        return new ResponseEntity<List<CurrencyRate>>(HttpStatus.OK);
    }

}
