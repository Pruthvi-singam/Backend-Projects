package org.job_application.job_application.Job.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="job_table")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    public Job(Long id, String description, String minSalary, String maxSalary, String location) {
        this.id = id;
        this.description = description;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
