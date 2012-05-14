package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.ScanRequest;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import org.codehaus.jackson.JsonToken;

public class ScanRequestJsonUnmarshaller implements Unmarshaller<ScanRequest, JsonUnmarshallerContext> {

    public ScanRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScanRequest request = new ScanRequest();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        while (true) {
            if (token == null) break;

            if (token == JsonToken.FIELD_NAME || token == JsonToken.START_OBJECT) {
                if (context.testExpression("Limit", targetDepth)) {
                    context.nextToken();
                    request.setLimit(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExclusiveStartKey", targetDepth)) {
                    request.setExclusiveStartKey(KeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttributesToGet", targetDepth)) {
                    request.setAttributesToGet(new ListUnmarshaller<String>(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == JsonToken.END_ARRAY || token == JsonToken.END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }

        return request;
    }

    private static ScanRequestJsonUnmarshaller instance;
    public static ScanRequestJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ScanRequestJsonUnmarshaller();
        return instance;
    }
}
