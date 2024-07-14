package com.notetaker.note_taker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notetaker.note_taker.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
