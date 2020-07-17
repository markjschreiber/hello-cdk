package com.myorg;

import software.amazon.awscdk.core.*;
import software.amazon.awscdk.services.s3.Bucket;

public class HelloCdkStack extends Stack {
    public HelloCdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public HelloCdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here
        Bucket.Builder.create(this, "cdk-app-first-bucket-mjs")
                      .versioned(true)
                      .removalPolicy(RemovalPolicy.DESTROY)
                      .build();
    }
}
