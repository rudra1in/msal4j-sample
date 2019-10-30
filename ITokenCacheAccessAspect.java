// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

/**
 * Interface representing operation of executing code before and after cache access.
 */
public interface ITokenCacheAccessAspect {

    void beforeCacheAccess(ITokenCacheAccessContext iTokenCacheAccessContext);

    void afterCacheAccess(ITokenCacheAccessContext iTokenCacheAccessContext);
}
