package org.job_application.job_application.Job.Service;

import org.job_application.job_application.Job.Entity.Job;
import org.job_application.job_application.Job.Repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JobServiceImp implements JobService{
    JobRepository jobRepository;
    public JobServiceImp(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    //    private List<Job> jobs=new ArrayList<>();

    private Long count=1L;

    @Override
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
//        job.setId(count++);
        jobRepository.save(job);

    }

    @Override
    public Job findJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
        try{
            jobRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    @Override
    public boolean updateJob(Long id,Job job) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if(jobOptional.isPresent())
        {
            Job job1=jobOptional.get();
            job1.setDescription(job.getDescription());
            job1.setMinSalary(job.getMinSalary());
            job1.setMaxSalary(job.getMaxSalary());
            job1.setLocation(job.getLocation());
            jobRepository.save(job1);
            return true;
        }
        return false;

    }
}
