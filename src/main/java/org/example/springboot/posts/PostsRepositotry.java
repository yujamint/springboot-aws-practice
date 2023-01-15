package org.example.springboot.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepositotry extends JpaRepository<Posts, Long> {
}
