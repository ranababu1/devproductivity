package org.zeta.devproductivity.jira.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.zeta.devproductivity.jira.model.JiraIssue;
import java.util.Arrays;
import java.util.List;

@Service
public class JiraApiClient {

    private final RestTemplate restTemplate;
    private final String jiraApiUrl;

    public JiraApiClient(RestTemplate restTemplate, @Value("${jira.api.url}") String jiraApiUrl) {
        this.restTemplate = restTemplate;
        this.jiraApiUrl = jiraApiUrl;
    }

    public List<JiraIssue> fetchJiraIssues() {
        JiraIssue[] issues = restTemplate.getForObject(jiraApiUrl, JiraIssue[].class);
        return issues != null ? Arrays.asList(issues) : List.of();
    }

    // Additional methods to interact with the Jira API
}
