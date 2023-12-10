package org.zeta.devproductivity.jira.controller;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.zeta.devproductivity.jira.service.JiraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/jira")
public class JiraController {

    private final JiraService service;

    public JiraController(JiraService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<JiraIssue>> getAllIssues() {
        return ResponseEntity.ok(service.getAllIssues());
    }

    // Additional endpoints as needed
}
