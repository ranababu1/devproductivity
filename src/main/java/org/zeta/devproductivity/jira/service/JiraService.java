package org.zeta.devproductivity.jira.service;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.zeta.devproductivity.jira.repository.JiraIssueRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JiraService {

    private final JiraIssueRepository repository;

    public JiraService(JiraIssueRepository repository) {
        this.repository = repository;
    }

    public List<JiraIssue> getIssuesByAssigneeEmail(String email) {
        return repository.findByAssigneeEmail(email);
    }

    // Method to save fetched Jira issues
    public void saveIssues(List<JiraIssue> issues) {
        repository.saveAll(issues);
    }
}
