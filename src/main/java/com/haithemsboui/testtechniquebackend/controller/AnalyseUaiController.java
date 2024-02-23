package com.haithemsboui.testtechniquebackend.controller;

import com.haithemsboui.testtechniquebackend.service.AnalyseUaiImplService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/analyse")
@CrossOrigin(origins = "http://localhost:4200/")
@RequiredArgsConstructor
public class AnalyseUaiController {
    private final AnalyseUaiImplService analyseService;


}
