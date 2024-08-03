package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.request.JsonRequest;
import com.LearningSpringBoot.LearningSpringBoot.response.JsonResponse;
import org.springframework.stereotype.Service;

@Service("reverseJsonService")
public class ReverseJsonServiceImpl implements JsonService {

    @Override
    public JsonResponse transform(JsonRequest jsonRequest) {
        String originalMessage = jsonRequest.getMessage();
        String transformedMessage = reverseMessage(originalMessage);
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setMessage(transformedMessage);
        return jsonResponse;
    }

    private String reverseMessage(String message) {
        // ở đây em dùng biếu thức chính quy để kiểm tra xem là số hay là chuỗi để đảo ngược ký tự
        if (message.matches("\\d+")) {
            return message;
        }
        return new StringBuilder(message).reverse().toString();
    }
}
