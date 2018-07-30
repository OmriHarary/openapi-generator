/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;

import static io.restassured.http.Method.*;

public class AnotherFakeApi {

    private RequestSpecBuilder reqSpec;

    private AnotherFakeApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static AnotherFakeApi anotherFake(RequestSpecBuilder reqSpec) {
        return new AnotherFakeApi(reqSpec);
    }


    public Call123testSpecialTagsOper call123testSpecialTags() {
        return new Call123testSpecialTagsOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public AnotherFakeApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * To test special tags
     * To test special tags and operation ID starting with number
     *
     * @see #body client model (required)
     * return Client
     */
    public class Call123testSpecialTagsOper {

        public static final String REQ_URI = "/another-fake/dummy";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public Call123testSpecialTagsOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public Call123testSpecialTagsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /another-fake/dummy
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PATCH, REQ_URI));
        }

        /**
         * PATCH /another-fake/dummy
         * @param handler handler
         * @return Client
         */
        public Client executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Client>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param client (Client) client model (required)
         * @return operation
         */
        public Call123testSpecialTagsOper body(Client client) {
            reqSpec.setBody(client);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public Call123testSpecialTagsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public Call123testSpecialTagsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}