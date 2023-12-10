package org.zeta.devproductivity.jira.repository;

import org.zeta.devproductivity.jira.model.JiraIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JiraIssueRepository extends JpaRepository<JiraIssue, Long> {
    List<JiraIssue> findByAssigneeEmail(String assigneeEmail);
}
