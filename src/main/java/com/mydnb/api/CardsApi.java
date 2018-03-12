package com.mydnb.api;

import com.mydnb.model.CardBalance;
import com.mydnb.model.CardInvoice;
import com.mydnb.model.Transaction;
import com.mydnb.model.Card;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Api(value = "cards", description = "the cards API")
public interface CardsApi {

    @ApiOperation(value = "Block card", notes = "Aviability for end-customet to block a debit or credit card. (Not Cresco Cards)", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The card is now blocked", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/cards/{cardId}/block",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<List<String>> blockCard(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


);


    @ApiOperation(value = "Get card balance", notes = "", response = CardBalance.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = CardBalance.class) })
    @RequestMapping(value = "/cards/{cardId}/balance",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<CardBalance> cardsCardIdBalanceGet(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


);


    @ApiOperation(value = "Get card statement", notes = "Get card statement for the specified month", response = CardInvoice.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = CardInvoice.class),
        @ApiResponse(code = 400, message = "Bad Request", response = CardInvoice.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = CardInvoice.class),
        @ApiResponse(code = 403, message = "Forbidden", response = CardInvoice.class),
        @ApiResponse(code = 404, message = "Not Found", response = CardInvoice.class) })
    @RequestMapping(value = "/cards/{cardId}/statement/{year}/{month}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<CardInvoice> gertCardInvoice(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


,
@ApiParam(value = "YYYY",required=true ) @PathVariable("year") String year


,
@ApiParam(value = "MM, where January is 01",required=true ) @PathVariable("month") String month


);


    @ApiOperation(value = "Get card details", notes = "**NOTE:** May not be relevant, if \"Get cards for current customer\" returnes the same information, but for all the customer's cards.  Includes balance and credit limit (when applicable).", response = Card.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Card.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Card.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Card.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Card.class),
        @ApiResponse(code = 404, message = "Not Found", response = Card.class) })
    @RequestMapping(value = "/cards/{cardId}/details",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Card> getCardDetailsById(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


);


    @ApiOperation(value = "Get card transactions", notes = "**Note:** Duplicates endpoint in ```Transactions```. For evaluation purposes.   Transactionlist for the customers creditcard", response = Transaction.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Transaction.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Transaction.class),
        @ApiResponse(code = 404, message = "Not Found", response = Transaction.class) })
    @RequestMapping(value = "/cards/{cardId}/transactions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getCardTransactions(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


);


    @ApiOperation(value = "Get cards for current customer", notes = "List over the current ```customer```'s debet and credit cards. ", response = Card.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Card.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Card.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Card.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Card.class),
        @ApiResponse(code = 404, message = "Not Found", response = Card.class) })
    @RequestMapping(value = "/cards",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Card>> getCardsForCurrentCustomer();


    @ApiOperation(value = "Unblock card", notes = "Unblock a blocked ```card```.", response = Void.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Cards", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Unblocked", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    @RequestMapping(value = "/cards/{cardId}/unblock",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> unblockCard(
@ApiParam(value = "",required=true ) @PathVariable("cardId") String cardId


);

}
