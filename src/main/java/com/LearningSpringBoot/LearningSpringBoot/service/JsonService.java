package com.LearningSpringBoot.LearningSpringBoot.service;
import com.LearningSpringBoot.LearningSpringBoot.request.JsonRequest;
import com.LearningSpringBoot.LearningSpringBoot.response.JsonResponse;
public interface JsonService {
    JsonResponse transform(JsonRequest jsonRequest);
}
