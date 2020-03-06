package com.songreating.ratingdataservice.resources;

import com.songreating.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingdata")
public class RatingDataResource {


    @RequestMapping("/{songId}")
    public Rating getRatingData(@PathVariable("songId") String songId){
    return new Rating(songId,4);
    }



}
