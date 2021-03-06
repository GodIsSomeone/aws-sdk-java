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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in requests
 * that CloudFront sends to the origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicyCookiesConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicyCookiesConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the origin.
     * Even when this field is set to <code>none</code>, any cookies that are listed in a <code>CachePolicy</code>
     * <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     */
    private String cookieBehavior;

    private CookieNames cookies;

    /**
     * <p>
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the origin.
     * Even when this field is set to <code>none</code>, any cookies that are listed in a <code>CachePolicy</code>
     * <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the
     *        origin. Even when this field is set to <code>none</code>, any cookies that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     * @see OriginRequestPolicyCookieBehavior
     */

    public void setCookieBehavior(String cookieBehavior) {
        this.cookieBehavior = cookieBehavior;
    }

    /**
     * <p>
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the origin.
     * Even when this field is set to <code>none</code>, any cookies that are listed in a <code>CachePolicy</code>
     * <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether cookies in viewer requests are included in requests that CloudFront sends to the
     *         origin. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the
     *         origin. Even when this field is set to <code>none</code>, any cookies that are listed in a
     *         <code>CachePolicy</code> <i>are</i> included in origin requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *         type are included in requests that CloudFront sends to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the
     *         origin.
     *         </p>
     *         </li>
     * @see OriginRequestPolicyCookieBehavior
     */

    public String getCookieBehavior() {
        return this.cookieBehavior;
    }

    /**
     * <p>
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the origin.
     * Even when this field is set to <code>none</code>, any cookies that are listed in a <code>CachePolicy</code>
     * <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the
     *        origin. Even when this field is set to <code>none</code>, any cookies that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyCookieBehavior
     */

    public OriginRequestPolicyCookiesConfig withCookieBehavior(String cookieBehavior) {
        setCookieBehavior(cookieBehavior);
        return this;
    }

    /**
     * <p>
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the origin.
     * Even when this field is set to <code>none</code>, any cookies that are listed in a <code>CachePolicy</code>
     * <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in requests that CloudFront sends to the
     *        origin. Even when this field is set to <code>none</code>, any cookies that are listed in a
     *        <code>CachePolicy</code> <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyCookieBehavior
     */

    public OriginRequestPolicyCookiesConfig withCookieBehavior(OriginRequestPolicyCookieBehavior cookieBehavior) {
        this.cookieBehavior = cookieBehavior.toString();
        return this;
    }

    /**
     * @param cookies
     */

    public void setCookies(CookieNames cookies) {
        this.cookies = cookies;
    }

    /**
     * @return
     */

    public CookieNames getCookies() {
        return this.cookies;
    }

    /**
     * @param cookies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyCookiesConfig withCookies(CookieNames cookies) {
        setCookies(cookies);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCookieBehavior() != null)
            sb.append("CookieBehavior: ").append(getCookieBehavior()).append(",");
        if (getCookies() != null)
            sb.append("Cookies: ").append(getCookies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginRequestPolicyCookiesConfig == false)
            return false;
        OriginRequestPolicyCookiesConfig other = (OriginRequestPolicyCookiesConfig) obj;
        if (other.getCookieBehavior() == null ^ this.getCookieBehavior() == null)
            return false;
        if (other.getCookieBehavior() != null && other.getCookieBehavior().equals(this.getCookieBehavior()) == false)
            return false;
        if (other.getCookies() == null ^ this.getCookies() == null)
            return false;
        if (other.getCookies() != null && other.getCookies().equals(this.getCookies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCookieBehavior() == null) ? 0 : getCookieBehavior().hashCode());
        hashCode = prime * hashCode + ((getCookies() == null) ? 0 : getCookies().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicyCookiesConfig clone() {
        try {
            return (OriginRequestPolicyCookiesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
