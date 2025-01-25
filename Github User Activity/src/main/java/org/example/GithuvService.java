package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GithuvService {

    private static final String GITHUB_API_URL="https://api.github.com/users/%s/events";

    public String fetActivity(String username) throws Exception{
        String url=String.format(GITHUB_API_URL,username);
        HttpURLConnection httpURLConnection=(HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode=httpURLConnection.getResponseCode();
        if(responseCode!=200)
        {
            throw new Exception("Failed to fetch user activity"+responseCode);
        }
        BufferedReader reader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder response=new StringBuilder();
        String line;
        while((line=reader.readLine())!=null)
        {
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}
