package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParserUtil {
    public static List<GItHubEvent> parseEvents(String jsonResponse)
    {
        List<GItHubEvent> events=new ArrayList<>();
        JSONArray jsonArray=new JSONArray(jsonResponse);

        for(int i=0;i<jsonArray.length();i++)
        {
            JSONObject eventObject=jsonArray.getJSONObject(i);
            String type=eventObject.getString("type");
            String repoName=eventObject.getJSONObject("repo").getString("name");
            events.add(new GItHubEvent(type,repoName));
        }
        return events;
    }
}
