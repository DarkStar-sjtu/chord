package cn.dk.chord.controller;

import cn.dk.chord.entity.Audio;
import cn.dk.chord.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/audios")
public class AudioController {

    @Autowired
    private AudioService audioService;

    @GetMapping
    private List<Audio> listAudio() {
        return audioService.list();
    }
}
