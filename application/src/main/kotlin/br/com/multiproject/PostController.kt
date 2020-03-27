package br.com.multiproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class PostController(val postRepository: PostRepository) {

    @GetMapping
    fun findAll() : Flux<Post> =  postRepository.findAll();

    @PostMapping("/batata")
    fun save(@RequestBody post : Post) : Mono<Post> = postRepository.save(post);


}