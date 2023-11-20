package com.springboot.omem.crawling.repository;

import com.springboot.omem.crawling.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
