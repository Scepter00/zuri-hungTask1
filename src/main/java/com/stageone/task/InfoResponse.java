package com.stageone.task.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoResponse {
    private String slackName;
    private String currentDay;
    private String utcTime;
    private String Track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private int statusCode;
}
