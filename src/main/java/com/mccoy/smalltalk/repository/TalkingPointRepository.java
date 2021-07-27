package com.mccoy.smalltalk.repository;

import com.mccoy.smalltalk.model.TalkingPoint;
import org.springframework.data.repository.CrudRepository;

public interface TalkingPointRepository extends CrudRepository<TalkingPoint, Long> {
}
