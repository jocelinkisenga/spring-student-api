package com.example.demo.library;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/library")
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    @GetMapping
    public List<Library> getLibraries(){
        return libraryService.allLibraries();
    }
    

    /**
     * @param library
     */
    @PostMapping
    public void addNewLibrary(@RequestBody Library library) {
        
        libraryService.addNewLibrary(library);
    }

    /**
     * @param libraryId
     * @return
     */
    @GetMapping("{libraryId}")
    private Optional<Library> findById(@PathVariable Long libraryId){
        
        return  libraryService.findOne(libraryId);
    }



}
