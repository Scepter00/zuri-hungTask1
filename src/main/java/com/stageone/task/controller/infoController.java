package com.stageone.task.controller;

import com.stageone.task.InfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RequestMapping("api/v1/info")
@RestController
public class infoController {

    @GetMapping("")
    public ResponseEntity <InfoResponse> getInfoResponse(
            @RequestParam String slackName,
            @RequestParam String track
    ) {
        SimpleDateFormat currentDayFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String currentDay = currentDayFormat.format(new Date());

        SimpleDateFormat utcTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String utcTime = utcTimeFormat.format(new Date());

        String github_file_url = "https://github.com/Scepter00/zuri-hungTask1";
        String github_repo_url = "https://github.com/Scepter00/zuri-hungTask1";
        int statusCode = 200;

        InfoResponse infoResponse = new InfoResponse(slackName, currentDay, utcTime, track, github_file_url, github_repo_url, statusCode);
        return ResponseEntity.ok(infoResponse);
    }
}
