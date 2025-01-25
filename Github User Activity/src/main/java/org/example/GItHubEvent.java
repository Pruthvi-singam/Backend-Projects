package org.example;

public class GItHubEvent {
    private String type;
    private String repoName;
    public GItHubEvent(String type,String repoName)
    {
        this.type=type;
        this.repoName=repoName;
    }

    @Override
    public String toString()
    {
        return type+" in "+repoName;
    }
}
