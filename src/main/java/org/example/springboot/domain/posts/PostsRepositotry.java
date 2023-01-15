package org.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepositotry extends JpaRepository<Posts, Long> {
}
