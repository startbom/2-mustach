package com.bomstart.chapter04_mustache.web;

import com.bomstart.chapter04_mustache.service.posts.PostsService;
import com.bomstart.chapter04_mustache.web.dto.PostsResponseDto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {
    // @GetMapping("/")
    // public String index() {
    //     return "index";
    // }
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
    
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
