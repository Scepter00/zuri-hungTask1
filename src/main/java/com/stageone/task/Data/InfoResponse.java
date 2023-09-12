package com.stageone.task.Data;

import lombok.*;

@Data
@AllArgsConstructor
public class InfoResponse {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
}
