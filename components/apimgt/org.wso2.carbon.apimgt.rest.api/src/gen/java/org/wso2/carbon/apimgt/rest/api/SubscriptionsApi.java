package org.wso2.carbon.apimgt.rest.api;

import org.wso2.carbon.apimgt.rest.api.model.*;
import org.wso2.carbon.apimgt.rest.api.SubscriptionsApiService;
import org.wso2.carbon.apimgt.rest.api.factories.SubscriptionsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.apimgt.rest.api.model.Error;
import org.wso2.carbon.apimgt.rest.api.model.Subscription;

import java.util.List;
import org.wso2.carbon.apimgt.rest.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/subscriptions")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/subscriptions", description = "the subscriptions API")
public class SubscriptionsApi  {

   private final SubscriptionsApiService delegate = SubscriptionsApiServiceFactory.getSubscriptionsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get subscription list", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Subscription list returned."),
        
        @io.swagger.annotations.ApiResponse(code = 304, message = "Not Modified. Empty body because the client has already the latest version of the requested resource."),
        
        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable. The requested media type is not supported") })

    public Response subscriptionsGet(@ApiParam(value = "Will return sunscriptions for the provided API") @QueryParam("apiId") String apiId,
    @ApiParam(value = "Will return subscriptions for the provided Application") @QueryParam("applicationId") String applicationId,
    @ApiParam(value = "Media types acceptable for the response. Should denote XML or JSON, default is JSON."  )@HeaderParam("Accept") String accept,
    @ApiParam(value = "Validator for conditional requests; based on ETag."  )@HeaderParam("If-None-Match") String ifNoneMatch)
    throws NotFoundException {
    return delegate.subscriptionsGet(apiId,applicationId,accept,ifNoneMatch);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Add a new subscription", response = Subscription.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created. Successful response with the newly created object as entity in the body. Location header contains URL of newly created entity."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request. Invalid request or validation error"),
        
        @io.swagger.annotations.ApiResponse(code = 415, message = "Unsupported media type. The entity of the request was in a not supported format.") })

    public Response subscriptionsPost(@ApiParam(value = "Subscription object that should to be added" ,required=true ) Subscription body,
    @ApiParam(value = "Media type of the entity in the request body. Should denote XML or JSON, default is JSON."  )@HeaderParam("Content-Type") String contentType)
    throws NotFoundException {
    return delegate.subscriptionsPost(body,contentType);
    }
    @GET
    @Path("/{subscriptionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get subscription details", response = Subscription.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Subscription returned"),
        
        @io.swagger.annotations.ApiResponse(code = 304, message = "Not Modified. Empty body because the client has already the latest version of the requested resource."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. Requested Subscription does not exist."),
        
        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable. The requested media type is not supported") })

    public Response subscriptionsSubscriptionIdGet(@ApiParam(value = "Media types acceptable for the response. Should denote XML or JSON, default is JSON."  )@HeaderParam("Accept") String accept,
    @ApiParam(value = "Validator for conditional requests; based on ETag."  )@HeaderParam("If-None-Match") String ifNoneMatch,
    @ApiParam(value = "Validator for conditional requests; based on Last Modified header."  )@HeaderParam("If-Modified-Since") String ifModifiedSince)
    throws NotFoundException {
    return delegate.subscriptionsSubscriptionIdGet(accept,ifNoneMatch,ifModifiedSince);
    }
    @PUT
    @Path("/{subscriptionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update subscription details", response = Subscription.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Subscription updated."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request. Invalid request or validation error"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. The resource to be updated does not exist."),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Precondition Failed. The request has not been performed because one of the preconditions is not met.") })

    public Response subscriptionsSubscriptionIdPut(@ApiParam(value = "Subscription object that needs to be modified" ,required=true ) Subscription body,
    @ApiParam(value = "Media type of the entity in the request body. Should denote XML or JSON, default is JSON."  )@HeaderParam("Content-Type") String contentType,
    @ApiParam(value = "Validator for conditional requests; based on ETag."  )@HeaderParam("If-Match") String ifMatch,
    @ApiParam(value = "Validator for conditional requests; based on Last Modified header."  )@HeaderParam("If-Unmodified-Since") String ifUnmodifiedSince)
    throws NotFoundException {
    return delegate.subscriptionsSubscriptionIdPut(body,contentType,ifMatch,ifUnmodifiedSince);
    }
    @DELETE
    @Path("/{subscriptionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Remove subscription", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Resource successfully deleted."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. Resource to be deleted does not exist."),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Precondition Failed. The request has not been performed because one of the preconditions is not met.") })

    public Response subscriptionsSubscriptionIdDelete(@ApiParam(value = "Validator for conditional requests; based on ETag."  )@HeaderParam("If-Match") String ifMatch,
    @ApiParam(value = "Validator for conditional requests; based on Last Modified header."  )@HeaderParam("If-Unmodified-Since") String ifUnmodifiedSince)
    throws NotFoundException {
    return delegate.subscriptionsSubscriptionIdDelete(ifMatch,ifUnmodifiedSince);
    }
}

