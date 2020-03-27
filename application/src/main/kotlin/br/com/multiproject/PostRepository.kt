/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.multiproject;


import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

interface PostRepository : ReactiveCrudRepository<Post, Integer> {

    @Query("SELECT * FROM posts WHERE title like $1")
    fun findByTitleContains(name: String) : Flux<Post>;

}