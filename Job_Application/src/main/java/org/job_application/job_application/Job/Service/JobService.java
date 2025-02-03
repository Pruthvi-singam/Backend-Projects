package org.job_application.job_application.Job.Service;

import org.job_application.job_application.Job.Entity.Job;

import java.util.List;

public interface JobService {
    public List<Job> findAllJobs();
    public void createJob(Job job);
    public Job findJobById(Long id);
    public boolean deleteJobById(Long id);
    public boolean updateJob(Long id,Job job);
}
