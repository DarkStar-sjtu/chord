package cn.dk.chord.service.impl;

import cn.dk.chord.entity.Audio;
import cn.dk.chord.mapper.AudioMapper;
import cn.dk.chord.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudioServiceImpl implements AudioService {


    @Autowired
    private AudioMapper mapper;

    @Override
    public List<Audio> list() {
        return mapper.selectList(null);
    }
}
