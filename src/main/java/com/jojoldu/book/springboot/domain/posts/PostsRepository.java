package com.jojoldu.book.springboot.domain.posts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;  // ← 추가

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")  // ← 추가
    List<Posts> findAllDesc();

    List<Posts> findByAuthor(String author);

}