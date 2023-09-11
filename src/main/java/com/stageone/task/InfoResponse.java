package com.stageone.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InfoResponse {
    private String slackName;
    private String currentDay;
    private String utcTime;
    private String Track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private int statusCode = 200;
}
