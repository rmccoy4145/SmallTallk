package com.mccoy.smalltalk.model;

import javax.persistence.*;

@Entity
public class TalkingPoint implements Comparable<TalkingPoint>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(TalkingPoint talkingPoint) {
        long comparedId = talkingPoint.getId();
        if(comparedId > this.id) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
