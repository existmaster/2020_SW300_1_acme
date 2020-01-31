package com.kosta.acme.course;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface LearningObjectRepository extends PagingAndSortingRepository<LearningObject, Long> {
}
