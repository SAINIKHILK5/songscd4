/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import java.util.ArrayList;
import com.example.song.model.*;
import com.example.song.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SongController {
    @Autowired
    public SongJpaService sjs;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return sjs.getSongs();
    }

    @GetMapping("/songs/songId")
    public Song getSongById(@PathVariable("songId") int songId) {
        return rs.getSongById(songId);
    }
}
