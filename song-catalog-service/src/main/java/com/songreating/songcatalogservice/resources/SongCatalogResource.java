package com.songreating.songcatalogservice.resources;

import com.songreating.songcatalogservice.models.CatalogItem;
import com.songreating.songcatalogservice.models.Rating;
import com.songreating.songcatalogservice.models.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class SongCatalogResource {
    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("324", 2)
        );

        return ratings.stream().map(rating-> {
           Song song= restTemplate.getForObject("http://localhost:8081/songs/" + rating.getSongId(), Song.class);
            return new CatalogItem(song.getName(), "Songbyeminem", rating.getRating());
        } )
                .collect(Collectors.toList());

    }
}

