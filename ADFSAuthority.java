// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

import java.net.URL;

// Not supported for now, but we will soon add support
class ADFSAuthority extends Authority{

    private final static String ADFSAuthorityFormat = "https://%s/%s/";

    ADFSAuthority(final URL authorityUrl) {
        super(authorityUrl);
        this.authority = String.format(ADFSAuthorityFormat, host, tenant);
    }
}
