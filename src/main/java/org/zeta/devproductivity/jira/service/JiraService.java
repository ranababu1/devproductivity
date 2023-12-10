package org.zeta.devproductivity.jira.service;

import org.zeta.devproductivity.jira.dto.DeveloperStats;
import org.zeta.devproductivity.jira.model.JiraIssue;
import org.zeta.devproductivity.jira.repository.JiraIssueRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class JiraService {

    private final JiraIssueRepository jiraIssueRepository;

    public JiraService(JiraIssueRepository jiraIssueRepository) {
        this.jiraIssueRepository = jiraIssueRepository;
    }

    public Map<String, DeveloperStats> getAllDeveloperStats() {
        List<JiraIssue> issues = jiraIssueRepository.findAll();
        return processIssues(issues);
    }

    public DeveloperStats getDeveloperStatsByEmail(String email) {
        List<JiraIssue> issues = jiraIssueRepository.findByAssigneeEmail(email);
        return processIssues(issues).getOrDefault(email, new DeveloperStats());
    }

    private Map<String, DeveloperStats> processIssues(List<JiraIssue> issues) {
        Map<String, DeveloperStats> statsMap = new HashMap<>();
        // Process issues and populate statsMap
        // This should involve counting tickets, categorizing them, etc.
        return statsMap;
    }
}
