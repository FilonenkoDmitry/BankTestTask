package com.mydnb.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "ideas", description = "the ideas API")
public interface IdeasApi {

    @ApiOperation(value = "Get IBAN for DNB account", notes = "**DRAFT IDEA:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no", response = String.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Bad accountNumber", response = String.class),
        @ApiResponse(code = 404, message = "Not a DNB accountNumber", response = String.class) })
    @RequestMapping(value = "/ideas/accounts/iban/{accountNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<String> getIbanForAccount(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


);


    @ApiOperation(value = "Verify that account belongs to a customer", notes = "**DRAFT IDEA:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no ", response = Void.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Void.class),
        @ApiResponse(code = 400, message = "Status 400", response = Void.class),
        @ApiResponse(code = 404, message = "No match", response = Void.class),
        @ApiResponse(code = 501, message = "Status 501", response = Void.class) })
    @RequestMapping(value = "/ideas/accounts/verify/{accountNumber}/{customerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> verifyAccount(
@ApiParam(value = "",required=true ) @PathVariable("accountNumber") String accountNumber


,
@ApiParam(value = "SSN or Organization number",required=true ) @PathVariable("customerId") String customerId


);


    @ApiOperation(value = "Verify IBAN format", notes = "**DRAFT IDEA:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no", response = String.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Bad accountNumber", response = String.class),
        @ApiResponse(code = 404, message = "Not a DNB accountNumber", response = String.class) })
    @RequestMapping(value = "/ideas/accounts/ibanverify/{IBAN}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<String> verifyIbanFormat(
@ApiParam(value = "",required=true ) @PathVariable("IBAN") String IBAN


);

}
