package io.tanishg.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    private static List<Topic> topics;

    static{
        topics = new ArrayList<>();
        topics.add(new Topic("111", "Java", "This is java topic"));
        topics.add(new Topic("222", "Pythin", "This is python topic"));
    }

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topics;
    }

}