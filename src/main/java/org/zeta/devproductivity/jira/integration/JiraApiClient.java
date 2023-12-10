package org.zeta.devproductivity.jira.integration;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class JiraApiClient {

    private final RestTemplate restTemplate;
    private final String jiraApiUrl = "https://imrn.dev/api/dummy";

    public JiraApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<JiraIssue> fetchJiraIssues() {
        // Implement the logic to call the Jira API and convert the response to List<JiraIssue>
    }
}
