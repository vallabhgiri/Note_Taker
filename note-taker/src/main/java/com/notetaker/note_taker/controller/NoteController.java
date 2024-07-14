package com.notetaker.note_taker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.notetaker.note_taker.model.Note;
import com.notetaker.note_taker.service.NoteService;



@Controller
public class NoteController {
	
    @Autowired
    private NoteService noteService;
    
    @GetMapping("/login")
    public String login() {
        return "login"; // This will resolve to login.html in templates folder
    }
    @GetMapping("/")
    public String getAllNotes(Model model) {
        List<Note> notes = noteService.getAllNotes();
        model.addAttribute("notes", notes);
        return "index";
    }

    @GetMapping("/new")
    public String newNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "new-note";
    }

    @PostMapping("/save")
    public String saveNote(@ModelAttribute("note") Note note) {
        noteService.saveOrUpdate(note);
        return "redirect:/";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNoteById(id);
        return "redirect:/";  // Redirect back to the list of notes
    }
    
    
  
}
