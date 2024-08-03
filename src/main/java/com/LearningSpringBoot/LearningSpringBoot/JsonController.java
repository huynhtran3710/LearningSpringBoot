package com.LearningSpringBoot.LearningSpringBoot;

import com.LearningSpringBoot.LearningSpringBoot.request.JsonRequest;
import com.LearningSpringBoot.LearningSpringBoot.response.JsonResponse;
import com.LearningSpringBoot.LearningSpringBoot.service.JsonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/json")
public class JsonController {

    private final JsonService jsonService;

    public JsonController( @Qualifier("reverseJsonService") JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @PostMapping("/transform")
    public JsonResponse transform(@Valid @RequestBody JsonRequest jsonRequest) {
        return jsonService.transform(jsonRequest);
    }


}
