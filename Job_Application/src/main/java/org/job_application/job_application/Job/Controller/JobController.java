package org.job_application.job_application.Job.Controller;

import org.job_application.job_application.Job.Entity.Job;
import org.job_application.job_application.Job.Service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jobs")
public class JobController  {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }


    @GetMapping
    public ResponseEntity<List<Job>> findall()
    {
        return new ResponseEntity<>(jobService.findAllJobs(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job)
    {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully",HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Job> fetchById(@PathVariable Long id)
    {
        Job job=jobService.findJobById(id);
        if(job!=null)
            return new ResponseEntity<>(job,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id )
    {
        boolean found=jobService.deleteJobById(id);
        if(found)
            return new ResponseEntity<>("Job deleted successfully",HttpStatus.OK);
        return new ResponseEntity<>("there is no id",HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id,@RequestBody Job newJob)
    {
        boolean update=jobService.updateJob(id,newJob);
        if(update)
            return new ResponseEntity<>("Job updated successfullly",HttpStatus.OK);
        return new ResponseEntity<>("There is no id found",HttpStatus.NOT_FOUND);
    }


}
