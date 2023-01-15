package org.example.springboot.domain.posts;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepositotry postsRepositotry;

    @After
    public void cleanup() {
        postsRepositotry.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepositotry.save(Posts.builder()
                .title(title)
                .content(content)
                .author("woawoa0513@gmail.com")
                .build());

        //when
        List<Posts> postsList = postsRepositotry.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
