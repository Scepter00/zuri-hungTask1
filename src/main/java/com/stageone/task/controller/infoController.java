package com.stageone.task.controller;

import com.stageone.task.Data.InfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class infoController {

    @GetMapping("/api")
    public ResponseEntity <InfoResponse> getInfoResponse(
            @RequestParam String  slack_name,
            @RequestParam String track
    ) {
        SimpleDateFormat current_day_format = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String current_day = current_day_format.format(new Date());

        SimpleDateFormat utc_time_format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String utc_time = utc_time_format.format(new Date());

        String github_file_url = "https://github.com/Scepter00/zuri-hungTask1/blob/master/src/main/java/com/stageone/task/controller/infoController.java";
        String github_repo_url = "https://github.com/Scepter00/zuri-hungTask1";
        int status_code = 200;

        InfoResponse infoResponse = new InfoResponse(slack_name, current_day, utc_time, track, github_file_url, github_repo_url, status_code);
        return ResponseEntity.ok(infoResponse);
    }
}
