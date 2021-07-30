package com.mccoy.smalltalk.service;

import com.mccoy.smalltalk.model.TalkingPoint;
import com.mccoy.smalltalk.repository.TalkingPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TalkingPointService {
    @Autowired
    TalkingPointRepository talkingPointRepository;

//    TODO: get total to make max random dynamic
    public TalkingPoint getRandom() {
        Random rnd = new Random();
        long idUsed = rnd.nextInt(4) + 1;
        return talkingPointRepository.findById(idUsed).get();
    }

    public List<TalkingPoint> getAll() {
        List<TalkingPoint> points = new ArrayList<>();
        talkingPointRepository.findAll().forEach((point) -> points.add(point));
        Collections.sort(points);
        return points;
    }

    public TalkingPoint getFirst() {
        return talkingPointRepository.findAll().iterator().next();
    }

    public TalkingPoint create(TalkingPoint talkingPoint) {
        return talkingPointRepository.save(talkingPoint);
    }
}
