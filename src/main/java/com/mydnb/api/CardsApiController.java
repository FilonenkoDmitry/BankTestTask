package com.mydnb.api;

import com.mydnb.model.CardBalance;
import com.mydnb.model.CardInvoice;
import com.mydnb.model.Card;
import com.mydnb.model.Transaction;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Controller
public class CardsApiController implements CardsApi {

    public ResponseEntity<List<String>> blockCard(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


) {
        // do some magic!
        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<CardBalance> cardsCardIdBalanceGet(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


) {
        // do some magic!
        return new ResponseEntity<CardBalance>(HttpStatus.OK);
    }

    public ResponseEntity<CardInvoice> gertCardInvoice(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


,
        
@ApiParam(value = "YYYY",required=true ) @PathVariable("year") String year


,
        
@ApiParam(value = "MM, where January is 01",required=true ) @PathVariable("month") String month


) {
        // do some magic!
        return new ResponseEntity<CardInvoice>(HttpStatus.OK);
    }

    public ResponseEntity<Card> getCardDetailsById(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


) {
        // do some magic!
        return new ResponseEntity<Card>(HttpStatus.OK);
    }

    public ResponseEntity<List<Transaction>> getCardTransactions(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


) {
        // do some magic!
        return new ResponseEntity<List<Transaction>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Card>> getCardsForCurrentCustomer() {
        // do some magic!
        return new ResponseEntity<List<Card>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> unblockCard(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
