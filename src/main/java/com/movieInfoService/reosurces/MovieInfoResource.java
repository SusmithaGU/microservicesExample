package com.movieInfoService.reosurces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/movie")
public class MovieInfoResource {
    @RequestMapping("/{movieid}")
   public List<Movie> getMovie(@PathVariable("movieid")String movieid){
       return Collections.singletonList(new Movie(movieid,4));
   }

}

