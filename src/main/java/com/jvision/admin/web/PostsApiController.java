package com.jvision.admin.web;

import com.jvision.admin.service.posts.PostsService;
import com.jvision.admin.web.dto.PostsResponseDto;
import com.jvision.admin.web.dto.PostsSaveRequestDto;
import com.jvision.admin.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts") //localhost:8080/api/v1/posts
    public Long save(@RequestBody PostsSaveRequestDto requestDto){ //글 등록 메소드
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") //HTTP 메소드, URI
    public  Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}") //HTTP 메소드, URI
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}") //HTTP 메소드, URI
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }

}
