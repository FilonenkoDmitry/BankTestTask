package com.mydnb.api;

import com.mydnb.model.Branch;
import com.mydnb.model.ATM;
import com.mydnb.model.OpeningTimes;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "locations", description = "the locations API")
public interface LocationsApi {

    @ApiOperation(value = "Find nearest ATM by coordinates", notes = "**NOTE:** Not planned for the first phase. See ```/locations/branches``` and ```/locations/Atms```.   If no details (as for now): Assume ATM is open 24h.", response = ATM.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = ATM.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ATM.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ATM.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ATM.class),
        @ApiResponse(code = 404, message = "Not Found", response = ATM.class) })
    @RequestMapping(value = "/locations/atm/{latitude}/{longditude}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<ATM>> findAtmByCoordinates(
@ApiParam(value = "Current latitude.",required=true ) @PathVariable("latitude") String latitude


,
@ApiParam(value = "Current longditude.",required=true ) @PathVariable("longditude") String longditude


);


    @ApiOperation(value = "Find nearest branch by address", notes = "**NOTE:** Not planned for the first phase. See ```/locations/branches``` and ```/locations/Atms```.   Basic geocoding functionality similar to Google Maps: https://developers.google.com/maps/documentation/geocoding/intro", response = Branch.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Branch.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Branch.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Branch.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Branch.class),
        @ApiResponse(code = 404, message = "Not Found", response = Branch.class) })
    @RequestMapping(value = "/locations/branch/findbyaddress",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Branch> findBranchByAddress(@ApiParam(value = "For now: Assume geocoding functionality similar to Google Maps: https://developers.google.com/maps/documentation/geocoding/intro") @RequestParam(value = "address", required = false) String address



);


    @ApiOperation(value = "Find nearest branch by coordinates", notes = "**NOTE:** Not planned for the first phase. See ```/locations/branches``` and ```/locations/Atms```. ", response = Branch.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Branch.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Branch.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Branch.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Branch.class),
        @ApiResponse(code = 404, message = "Not Found", response = Branch.class) })
    @RequestMapping(value = "/locations/branch/{latitude}/{longditude}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Branch> findBranchByCoordinates(
@ApiParam(value = "",required=true ) @PathVariable("latitude") String latitude


,
@ApiParam(value = "",required=true ) @PathVariable("longditude") String longditude


);


    @ApiOperation(value = "Get branch details", notes = "**NOTE:** Not planned for the first phase. See ```/locations/branches``` and ```/locations/Atms```.   Contact information, opening hours, etc.", response = Branch.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Branch.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Branch.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Branch.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Branch.class),
        @ApiResponse(code = 404, message = "Not Found", response = Branch.class) })
    @RequestMapping(value = "/locations/branch/{branchid}/details",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Branch> getBranchDetails(
@ApiParam(value = "Id of branch",required=true ) @PathVariable("branchid") String branchid


);


    @ApiOperation(value = "Get a branch's opening times", notes = "**NOTE:** Not planned for the first phase. See ```/locations/branches``` and ```/locations/Atms```.   Opening times is also included in Branch.", response = OpeningTimes.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = OpeningTimes.class),
        @ApiResponse(code = 400, message = "Bad Request", response = OpeningTimes.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = OpeningTimes.class),
        @ApiResponse(code = 403, message = "Forbidden", response = OpeningTimes.class),
        @ApiResponse(code = 404, message = "Not Found", response = OpeningTimes.class) })
    @RequestMapping(value = "/locations/branch/{branchid}/openingtimes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<OpeningTimes> getBranchOpeningTimes(
@ApiParam(value = "Id of a branch",required=true ) @PathVariable("branchid") String branchid


);


    @ApiOperation(value = "Get list of all DNB ATMs", notes = "", response = Branch.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Branch.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Branch.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Branch.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Branch.class),
        @ApiResponse(code = 404, message = "Not Found", response = Branch.class) })
    @RequestMapping(value = "/locations/Atms",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Branch>> listAtms();


    @ApiOperation(value = "Get list of all DNB branches", notes = "", response = Branch.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Branch.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Branch.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Branch.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Branch.class),
        @ApiResponse(code = 404, message = "Not Found", response = Branch.class) })
    @RequestMapping(value = "/locations/branches",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Branch>> listBranches();

}
