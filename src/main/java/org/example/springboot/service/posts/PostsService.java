package org.example.springboot.service.posts;

import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springboot.domain.posts.PostsRepositotry;
import org.example.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepositotry postsRepositotry;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepositotry.save(requestDto.toEntity()).getId();
    }
}
