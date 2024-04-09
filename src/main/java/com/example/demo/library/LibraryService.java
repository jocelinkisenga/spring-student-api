package com.example.demo.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> allLibraries(){
        return this.libraryRepository.findAll();
    }

     void addNewLibrary(Library library){
        this.libraryRepository.save(library);
    }

    public Optional<Library> findOne(Long Id){
        return  this.libraryRepository.findById(Id);
    }

//    private void updateLibrary(Long libraryId) {
//        Library library1 = this.libraryRepository.findById(libraryId);
//
//        library1.
//    }

}
