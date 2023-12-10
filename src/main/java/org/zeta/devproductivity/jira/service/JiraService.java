package org.zeta.devproductivity.jira.service;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.zeta.devproductivity.jira.repository.JiraIssueRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JiraService {
    private final JiraIssueRepository jiraIssueRepository;

    public JiraService(JiraIssueRepository jiraIssueRepository) {
        this.jiraIssueRepository = jiraIssueRepository;
    }

    public List<JiraIssue> getIssuesByAssigneeEmail(String email) {
        return jiraIssueRepository.findByAssigneeEmail(email);
    }

    // Add other service methods as needed...
}
