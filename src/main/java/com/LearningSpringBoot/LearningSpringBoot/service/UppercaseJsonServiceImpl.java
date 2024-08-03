package com.LearningSpringBoot.LearningSpringBoot.service;

import com.LearningSpringBoot.LearningSpringBoot.request.JsonRequest;
import com.LearningSpringBoot.LearningSpringBoot.response.JsonResponse;
import org.springframework.stereotype.Service;

@Service("uppercaseJsonService")
public class UppercaseJsonServiceImpl implements JsonService {
    @Override
    public JsonResponse transform(JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setMessage(jsonRequest.getMessage().toUpperCase());
        return jsonResponse;
    }
}
