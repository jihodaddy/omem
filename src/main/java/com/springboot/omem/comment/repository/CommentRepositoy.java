package com.springboot.omem.comment.repository;

import com.springboot.omem.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepositoy extends JpaRepository<Comment, Long> {

}
