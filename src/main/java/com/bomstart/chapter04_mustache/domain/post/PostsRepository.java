package com.bomstart.chapter04_mustache.domain.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Dao라고 불리는 DB layar 접근자

public interface PostsRepository extends JpaRepository<Posts,Long>{
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}