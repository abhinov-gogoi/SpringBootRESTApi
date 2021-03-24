package com.example.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


// In spring, business services are usually singleton classes which are used by other classes
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Spring framework", "A popular java framework"),
                new Topic("2", "Maven", "used as build tool"),
                new Topic("3", "Git", "used as version control tool"),
                new Topic("4", "Jira", "used as project management tool")
                );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
