package com.mydnb.api;

import java.util.List;
import com.mydnb.model.Customer;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "customers", description = "the customers API")
public interface CustomersApi {

    @ApiOperation(value = "Update customer", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Void.class),
        @ApiResponse(code = 400, message = "Status 400", response = Void.class),
        @ApiResponse(code = 500, message = "Status 500", response = Void.class) })
    @RequestMapping(value = "/customers/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> customersCustomerIdPatch(
@ApiParam(value = "",required=true ) @PathVariable("customerId") String customerId


,

@ApiParam(value = "" ,required=true ) @RequestBody List<String> body

);


    @ApiOperation(value = "Get customer's details by id", notes = "Get ```customer``` details by id.  A little test of example code below.  Request:  ``` GET /customers/12345 HTTP/1.1 Accept: application/json Host: 1gh7oej.restletmocks.net ```  Response:  ``` HTTP/1.1 200 OK Accept-Ranges: bytes Content-Type: application/json; charset=UTF-8 Date: Thu, 22 Feb 2018 12:10:31 GMT Date: Thu, 22 Feb 2018 12:10:31 GMT Server: Restlet-Framework/3.41.9 Content-Length: 724 Connection: keep-alive  {   \"customerId\" : \"12345678901\",   \"customerType\" : \"PERSON\",   \"firstName\" : \"Rune\",   \"lastName\" : \"Bjerke\",   \"companyName\" : \"DNB\",   \"address\" : {     \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",     \"postalAddressLine2\" : \"c/o CEO office\",     \"postalAddressLine3\" : \"example\",     \"postCode\" : \"0191\",     \"postCity\" : \"Oslo\",     \"postCountry\" : \"NO\"   },   \"email\" : \"example@example.com\",   \"phone\" : \"+4791504800\",   \"countryOfBirth\" : \"NO\",   \"countryCitizenships\" : [ \"NO\" ],   \"countryTax\" : [ \"NO\" ],   \"customerEngagement\" : [ {     \"engagementId\" : \"12345\",     \"engagementType\" : \"DEPOSIT\",     \"accountNumber\" : \"12345678901\",     \"friendlyName\" : \"SAGA MasterCard\",     \"corporate\" : true   } ] } ```", response = Customer.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Customer found", response = Customer.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Customer.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Customer.class),
        @ApiResponse(code = 404, message = "Not Found", response = Customer.class) })
    @RequestMapping(value = "/customers/{customerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Customer> getCustomerById(
@ApiParam(value = "",required=true ) @PathVariable("customerId") String customerId


);


    @ApiOperation(value = "Get current customer's details", notes = "**NOTE:** This endpoint may disappear, as ```/customers/{customerId}``` offers the same functionality.  Get current ```customer``` details. The ```customerId```is included in the context object.", response = Customer.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Customer found", response = Customer.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Customer.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Customer.class),
        @ApiResponse(code = 404, message = "Not Found", response = Customer.class) })
    @RequestMapping(value = "/customers/current",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Customer> getCustomerCurrent();

}
