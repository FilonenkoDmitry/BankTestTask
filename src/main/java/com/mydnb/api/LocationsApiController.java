package com.mydnb.api;

import com.mydnb.model.Branch;
import com.mydnb.model.ATM;
import com.mydnb.model.OpeningTimes;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class LocationsApiController implements LocationsApi {

    public ResponseEntity<List<ATM>> findAtmByCoordinates(
@ApiParam(value = "Current latitude.",required=true ) @PathVariable("latitude") String latitude


,
        
@ApiParam(value = "Current longditude.",required=true ) @PathVariable("longditude") String longditude


) {
        // do some magic!
        return new ResponseEntity<List<ATM>>(HttpStatus.OK);
    }

    public ResponseEntity<Branch> findBranchByAddress(@ApiParam(value = "For now: Assume geocoding functionality similar to Google Maps: https://developers.google.com/maps/documentation/geocoding/intro") @RequestParam(value = "address", required = false) String address



) {
        // do some magic!
        return new ResponseEntity<Branch>(HttpStatus.OK);
    }

    public ResponseEntity<Branch> findBranchByCoordinates(
@ApiParam(value = "",required=true ) @PathVariable("latitude") String latitude


,
        
@ApiParam(value = "",required=true ) @PathVariable("longditude") String longditude


) {
        // do some magic!
        return new ResponseEntity<Branch>(HttpStatus.OK);
    }

    public ResponseEntity<Branch> getBranchDetails(
@ApiParam(value = "Id of branch",required=true ) @PathVariable("branchid") String branchid


) {
        // do some magic!
        return new ResponseEntity<Branch>(HttpStatus.OK);
    }

    public ResponseEntity<OpeningTimes> getBranchOpeningTimes(
@ApiParam(value = "Id of a branch",required=true ) @PathVariable("branchid") String branchid


) {
        // do some magic!
        return new ResponseEntity<OpeningTimes>(HttpStatus.OK);
    }

    public ResponseEntity<List<Branch>> listAtms() {
        // do some magic!
        return new ResponseEntity<List<Branch>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Branch>> listBranches() {
        // do some magic!
        return new ResponseEntity<List<Branch>>(HttpStatus.OK);
    }

}
