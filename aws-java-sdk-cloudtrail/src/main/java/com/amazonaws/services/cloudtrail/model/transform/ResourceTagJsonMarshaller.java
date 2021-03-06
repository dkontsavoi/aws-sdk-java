/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ResourceTagMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTagJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ResourceTag resourceTag, StructuredJsonGenerator jsonGenerator) {

        if (resourceTag == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (resourceTag.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(resourceTag.getResourceId());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsListList = (com.amazonaws.internal.SdkInternalList<Tag>) resourceTag.getTagsList();
            if (!tagsListList.isEmpty() || !tagsListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("TagsList");
                jsonGenerator.writeStartArray();
                for (Tag tagsListListValue : tagsListList) {
                    if (tagsListListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceTagJsonMarshaller instance;

    public static ResourceTagJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTagJsonMarshaller();
        return instance;
    }

}
