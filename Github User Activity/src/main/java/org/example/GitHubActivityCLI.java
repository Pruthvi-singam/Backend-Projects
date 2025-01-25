package org.example;

import java.util.List;
import java.util.Scanner;

public class GitHubActivityCLI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a GitHub username: ");
        String githubUserName=sc.nextLine();
        GithuvService service=new GithuvService();
        try
        {
            String response=service.fetActivity(githubUserName);
            List<GItHubEvent> events=JsonParserUtil.parseEvents(response);
            if(events.isEmpty())
            {
                System.out.println("no events activity forund for user:"+githubUserName);
            }
            else
            {
                events.forEach(System.out::println);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }

    }
}