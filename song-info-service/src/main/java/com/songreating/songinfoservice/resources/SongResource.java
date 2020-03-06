package com.songreating.songinfoservice.resources;

import com.songreating.songinfoservice.models.Song;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/songs")
public class SongResource {

    @RequestMapping("/{songId}")
    public Song getSongInfo(@PathVariable("songId") String songId){

        return new Song(songId, "Test name");
    }

    }
