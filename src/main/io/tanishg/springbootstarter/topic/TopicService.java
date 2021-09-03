package io.tanishg.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private static List<Topic> allTopics;

    static {
        allTopics = new ArrayList<>();
        allTopics.add(new Topic("111", "Java", "This is Java topic"));
        allTopics.add(new Topic("222", "Python", "This is Python topic"));
    }

    public List<Topic> getAllTopics() {
        return allTopics;
    }

    public Topic getTopicById(String id) {
        for (Topic topic : allTopics) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }
        return null;
    }

    public String addTopic(Topic topic) {
        allTopics.add(topic);
        return "Topic created with the topic ID:\t" + topic.getId();
    }

    public String removeTopicById(String id) {
        allTopics.removeIf(topic -> topic.getId().equals(id));
        return "Topic removed with the topic ID:\t" + id;
    }

    public String updateTopic(String id, Topic topic) {
        for (int i = 0; i < allTopics.size(); i++) {
            if (id.equals(allTopics.get(i).getId())) {
                allTopics.set(i, topic);
                continue;
            }
        }
        return "Topic updated with the topic ID:\t" + id;
    }

}
