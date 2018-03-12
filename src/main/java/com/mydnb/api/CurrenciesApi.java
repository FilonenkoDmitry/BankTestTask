package com.mydnb.api;

import com.mydnb.model.CurrencyRate;
import org.joda.time.LocalDate;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "currencies", description = "the currencies API")
public interface CurrenciesApi {

    @ApiOperation(value = "Currency conversion", notes = "Convert amount from CUR1 to CUR2. Quite basic for now. Input welcome.", response = CurrencyRate.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Currencies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = CurrencyRate.class),
        @ApiResponse(code = 400, message = "Bad Request", response = CurrencyRate.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = CurrencyRate.class),
        @ApiResponse(code = 403, message = "Forbidden", response = CurrencyRate.class),
        @ApiResponse(code = 404, message = "Not Found", response = CurrencyRate.class) })
    @RequestMapping(value = "/currencies/convert/{base}/{currency}/{amount}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<CurrencyRate> currencyConvert(
@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true ) @PathVariable("base") String base


,
@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true ) @PathVariable("currency") String currency


,
@ApiParam(value = "",required=true ) @PathVariable("amount") BigDecimal amount


,@ApiParam(value = "End of day rate.") @RequestParam(value = "date", required = false) LocalDate date



);


    @ApiOperation(value = "Get a currency rate list", notes = "Suitable for making a table or similar.  ``` {     timestamp: 1504548341,     base: \"NOK\",     rates: {         AED: 3.672538,         AFN: 66.809999,         ALL: 125.716501,         AMD: 484.902502,         ANG: 1.788575,         AOA: 135.295998,         ARS: 9.750101,         AUD: 1.390866,         /_* ... *_/     } } ```", response = CurrencyRate.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Currencies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = CurrencyRate.class),
        @ApiResponse(code = 400, message = "Bad Request", response = CurrencyRate.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = CurrencyRate.class),
        @ApiResponse(code = 403, message = "Forbidden", response = CurrencyRate.class),
        @ApiResponse(code = 404, message = "Not Found", response = CurrencyRate.class) })
    @RequestMapping(value = "/currencies/list/{base}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<CurrencyRate>> currencyList(
@ApiParam(value = "\"Home\" currency. ISO 4217: alpha 3-letter upcase",required=true ) @PathVariable("base") String base


,@ApiParam(value = "End of day rate.") @RequestParam(value = "date", required = false) String date



);

}
