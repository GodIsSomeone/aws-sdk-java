/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TestCustomDataIdentifierRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestCustomDataIdentifierRequestMarshaller {

    private static final MarshallingInfo<List> IGNOREWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ignoreWords").build();
    private static final MarshallingInfo<List> KEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keywords").build();
    private static final MarshallingInfo<Integer> MAXIMUMMATCHDISTANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumMatchDistance").build();
    private static final MarshallingInfo<String> REGEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regex").build();
    private static final MarshallingInfo<String> SAMPLETEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleText").build();

    private static final TestCustomDataIdentifierRequestMarshaller instance = new TestCustomDataIdentifierRequestMarshaller();

    public static TestCustomDataIdentifierRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestCustomDataIdentifierRequest testCustomDataIdentifierRequest, ProtocolMarshaller protocolMarshaller) {

        if (testCustomDataIdentifierRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testCustomDataIdentifierRequest.getIgnoreWords(), IGNOREWORDS_BINDING);
            protocolMarshaller.marshall(testCustomDataIdentifierRequest.getKeywords(), KEYWORDS_BINDING);
            protocolMarshaller.marshall(testCustomDataIdentifierRequest.getMaximumMatchDistance(), MAXIMUMMATCHDISTANCE_BINDING);
            protocolMarshaller.marshall(testCustomDataIdentifierRequest.getRegex(), REGEX_BINDING);
            protocolMarshaller.marshall(testCustomDataIdentifierRequest.getSampleText(), SAMPLETEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
