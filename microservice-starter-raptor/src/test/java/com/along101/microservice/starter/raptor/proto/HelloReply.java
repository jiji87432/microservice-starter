// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: com/along101/framework/raptor/proto/helloworld.proto
package com.along101.microservice.starter.raptor.proto;

import com.along101.raptor.annotation.RaptorField;
import com.along101.raptor.annotation.RaptorMessage;

@RaptorMessage(
        version = "version.0.1",
        protoFile = "helloworld"
)
public final class HelloReply {

    @RaptorField(
            fieldType = "string",
            order = 1,
            name = "message"
    )
    private String message;

    public HelloReply() {
    }

    public HelloReply(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (message != null) builder.append(", message=").append(message);
        return builder.replace(0, 2, "HelloReply{").append('}').toString();
    }
}