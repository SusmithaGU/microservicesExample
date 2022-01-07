package com.example.movieCatalogService.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {

@RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable("userid") String userid){
    return Collections.singletonList(new CatalogItem("TRANSFORMERS","rated well",4));
}




}
