package org.example;

import java.util.List;
import java.util.Scanner;

public class GitHubActivityCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java GitHubActivityCLI <GitHubUsername>");
            return;
        }
        String username = args[0];
        GithuvService service=new GithuvService();
        try
        {
            String response=service.fetActivity(username);
            List<GItHubEvent> events=JsonParserUtil.parseEvents(response);
            if(events.isEmpty())
            {
                System.out.println("no events activity forund for user:"+username);
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