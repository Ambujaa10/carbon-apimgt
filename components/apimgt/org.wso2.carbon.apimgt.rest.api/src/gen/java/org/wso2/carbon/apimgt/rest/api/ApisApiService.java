package org.wso2.carbon.apimgt.rest.api;

import org.wso2.carbon.apimgt.rest.api.*;
import org.wso2.carbon.apimgt.rest.api.model.*;

import org.wso2.carbon.apimgt.rest.api.model.Error;
import org.wso2.carbon.apimgt.rest.api.model.API;
import org.wso2.carbon.apimgt.rest.api.model.Document;

import java.util.List;
import org.wso2.carbon.apimgt.rest.api.NotFoundException;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class ApisApiService {
  
      public abstract Response apisGet(String limit,String offset,String query,String type,String sort,String accept,String ifNoneMatch)
      throws NotFoundException;
  
      public abstract Response apisPost(API body,String contentType)
      throws NotFoundException;
  
      public abstract Response apisChangeLifecyclePost(String newState,String publishToGateway,String resubscription,String apiId,String ifMatch,String ifUnmodifiedSince)
      throws NotFoundException;
  
      public abstract Response apisCopyApiPost(String newVersion,String apiId)
      throws NotFoundException;
  
      public abstract Response apisApiIdGet(String accept,String ifNoneMatch,String ifModifiedSince)
      throws NotFoundException;
  
      public abstract Response apisApiIdPut(API body,String contentType,String ifMatch,String ifUnmodifiedSince)
      throws NotFoundException;
  
      public abstract Response apisApiIdDelete(String ifMatch,String ifUnmodifiedSince)
      throws NotFoundException;
  
      public abstract Response apisApiIdDocumentsGet(String limit,String offset,String query,String accept,String ifNoneMatch)
      throws NotFoundException;
  
      public abstract Response apisApiIdDocumentsPost(Document body,String contentType)
      throws NotFoundException;
  
      public abstract Response apisApiIdDocumentsDocumentIdGet(String accept,String ifNoneMatch,String ifModifiedSince)
      throws NotFoundException;
  
      public abstract Response apisApiIdDocumentsDocumentIdPut(Document body,String contentType,String ifMatch,String ifUnmodifiedSince)
      throws NotFoundException;
  
      public abstract Response apisApiIdDocumentsDocumentIdDelete(String ifMatch,String ifUnmodifiedSince)
      throws NotFoundException;
  
}
