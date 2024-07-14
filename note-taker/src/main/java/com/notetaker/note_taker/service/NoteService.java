package com.notetaker.note_taker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notetaker.note_taker.model.Note;
import com.notetaker.note_taker.repository.NoteRepository;

@Service
public class NoteService {

	@Autowired
	private NoteRepository noteRepository;
	
	public List<Note> getAllNotes()
	{
		return noteRepository.findAll();
	}
	   public Optional<Note> getNoteById(Long id) {
	        return noteRepository.findById(id);
	    }

	    public Note saveOrUpdate(Note note) {
	        return noteRepository.save(note);
	    }

	    public void deleteNoteById(Long id) {
	        noteRepository.deleteById(id);
	    }
	   
}
	
