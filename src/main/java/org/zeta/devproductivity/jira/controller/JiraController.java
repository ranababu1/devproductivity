package org.zeta.devproductivity.jira.controller;

import org.zeta.devproductivity.jira.dto.DeveloperStats;
import org.zeta.devproductivity.jira.service.JiraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jira")
public class JiraController {

    private final JiraService jiraService;

    public JiraController(JiraService jiraService) {
        this.jiraService = jiraService;
    }

    @GetMapping
    public ResponseEntity<?> getAllDeveloperStats() {
        var stats = jiraService.getAllDeveloperStats();
        return ResponseEntity.ok(stats);
    }

    @GetMapping("/{email}")
    public ResponseEntity<?> getDeveloperStatsByEmail(@PathVariable String email) {
        var stats = jiraService.getDeveloperStatsByEmail(email);
        return ResponseEntity.ok(stats);
    }
}
