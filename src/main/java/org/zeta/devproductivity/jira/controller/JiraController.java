package org.zeta.devproductivity.jira.controller;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.zeta.devproductivity.jira.service.JiraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jira")
public class JiraController {
    private final JiraService jiraService;

    public JiraController(JiraService jiraService) {
        this.jiraService = jiraService;
    }

    @GetMapping("/issues/{email}")
    public ResponseEntity<List<JiraIssue>> getIssuesByAssigneeEmail(@PathVariable String email) {
        List<JiraIssue> issues = jiraService.getIssuesByAssigneeEmail(email);
        return ResponseEntity.ok(issues);
    }

    // Additional endpoints as needed...
}
