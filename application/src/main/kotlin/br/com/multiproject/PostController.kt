package br.com.multiproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class PostController(val postRepository: PostRepository) {

    @GetMapping
    fun findAll() : Flux<Post> =  postRepository.findAll();


}