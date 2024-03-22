package com.example.song.service;

/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 */

// Write your code here

import java.util.ArrayList;
import java.util.List;
import com.example.song.model.*;
import com.example.song.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class SongJpaService implements SongRepository {
    @Autowired
    private SongJpaRepository sj;

    @Override
    public ArrayList<Song> getSongs() {
        List<Song> l1 = sj.findAll();
        ArrayList<Song> arlst1 = new ArrayList<>(l1);
        return arlst1;
    }

    @Override

    public Song getSongById(int songId) {
        try {
            Song s1 = sj.findById(songId).get();
            return s1;
        }

        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}