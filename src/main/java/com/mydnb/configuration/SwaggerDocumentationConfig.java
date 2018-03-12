package com.mydnb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("DNB Developer APIs")
            .description("**IMPORTANT:** This is a work in progress, and all information may change at any time. Final APIs may look very different. Until there is an official release, these APIs should be seen as unfinished drafts.  **General guidelines:**  * We use camelCase, starting with lowercase: ```customerEngagement```, ```accountNumber```, ```creditCard```, etc. * Unless implicit by Swagger, standards are mentioned and refered to. * General rule: The response (object) determines endpoint: If the response is ```account```, the endpoint should be under ```/accounts```. In cases where this may be up for discussion, multiple endpoints may, for a limited time, be available in order to evaluate. * Versioning: Major.Minor.Patch (https://semver.org/). Major: Incompatible changes. Minor: New, backwards-compatible functionality. Patch: Backwards-compatible fixes. * Some endpoints start with ```/ideas``` and are marked \"DRAFT IDEA\". These enpoints are ideas we would like feedback on. Requests typically return ```HTTP 501 Not Implemented``` and a ```notImplemented```response, as well as a standard ```error```.  **Standards:**  All APIs use ISO and RFC standards:  * Swagger specification: https://swagger.io/specification/ * Country: ISO 3166-1 alpha-2: : https://www.iso.org/standard/63546.html (```NO```, ```GB```, ```US```) * Currency: ISO 4217: alpha 3-letter upcase: https://www.iso.org/iso-4217-currency-codes.html (```NOK```, ```EUR```, ```USD```) * Date: According to Swagger specification: ISO 8601:  www.iso.org/iso/home/standards/iso8601.htm (date: ```2018-12-31```, timestamp: ```2018-12-31T23:59:59+01:00```) * SWIFT BIC: ISO 9362: https://en.wikipedia.org/wiki/ISO_9362 (```DNBANOKKXXX```) * IBAN ISO 13616:2007: https://www.iso.org/standard/41031.html (```NO9386011117947```) * MCC: ISO 18245: https://www.iso.org/standard/33365.html (https://github.com/greggles/mcc-codes) (```3514: Hotels/Motels/Inns/Resorts```)  **HTTP Response Codes**  HTTP response are intended to be logical: If a ```customer```or an ```account``` does not exist, the response is ```404 Not Found```.  All errors return a relevant HTTP status code and response with an ``error`` containing additional details. The HTTP statuses returned are:  Success  * ```200: OK``` Success!    * ```201: Created``` Resource created. Reference included.  Client Error  * ```400: Bad Request``` Your request was, somehow, not ok.   * ```401: Unauthorized``` You are unknown.    * ```403: Forbidden``` We know who you are, but you are attempting something you are not allowed to.   * ```404: Not Found``` What you looked for is not here.   * ```429: Too Many Requests``` Settle down!  Server Error  * ```500: Server Error``` We screwed up, sorry! * ```501 Not Implemented``` The operation is not (yet) implemented.  * ```503: Service Unavailable``` Something is very wrong. * ```504: Timeout``` We need to speed up internally,    **Github**  Swagger documentation is (for now) available on Github: https://github.com/cloveras/dnb/   ")
            .license("")
            .licenseUrl("")
            .termsOfServiceUrl("https://dnb.no")
            .version("0.10.3")
            .contact(new Contact("","", "cl@dnb.no"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
