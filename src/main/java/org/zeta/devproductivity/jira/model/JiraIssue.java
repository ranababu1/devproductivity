package org.zeta.devproductivity.jira.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class JiraIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String key;
    private String summary;
    private String description;
    private String assignee;
    private String assigneeEmail;
    private String reporter;
    private String priority;
    private String status;
    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime dueDate;

    @ElementCollection
    private List<String> labels;

    @ElementCollection
    private List<String> components;

    private String epicLink;
    private Integer storyPoints;

    // Constructors, Getters, Setters
}
