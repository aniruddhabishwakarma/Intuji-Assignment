package com.Intuji.Assignment.respository;

import com.Intuji.Assignment.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<BlogEntity,Integer> {
}
