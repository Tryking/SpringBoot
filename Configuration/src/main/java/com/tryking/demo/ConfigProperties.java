package com.tryking.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author tryking
 */
@Component
@PropertySource(value = "classpath:configprops.properties")
@ConfigurationProperties(prefix = "user")
public class ConfigProperties {
    private String name;
    private String password;
    private int age;
    private List<String> friends;
    private Map<String, Integer> scores;
    private Job job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigProperties{");
        sb.append("name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append(", friends=").append(friends);
        sb.append(", scores=").append(scores);
        sb.append(", job=").append(job);
        sb.append('}');
        return sb.toString();
    }
}
