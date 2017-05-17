package com.levelsbeyond.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.levelsbeyond.challenge.model.Note;
import com.levelsbeyond.challenge.service.INoteService;

/**
 * 
 * @author michael.humphrey
 *
 */
@RestController
@RequestMapping("api/")
public class NoteController {

	@Autowired
	INoteService noteService;

	public NoteController() {
	}

	/**
	 * Get all notes that are currently in storage
	 * 
	 * @return the list of notes in storage
	 */
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list(@RequestParam(value = "query", defaultValue = "") String searchQuery) {

		return noteService.list(searchQuery);
	}

	/**
	 * Get one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the note retrieved from storage
	 */
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note get(@PathVariable Long id) {

		return noteService.get(id);
	}

	/**
	 * 
	 * @param note
	 *            the note object to use for creating a new note in storage
	 * @return the newly created note
	 */
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {

		return noteService.create(note);
	}

	/**
	 * Delete one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the deleted note
	 */
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {

		return noteService.delete(id);
	}

	/**
	 * 
	 * @param id
	 *            the id of the note
	 * @param note
	 *            the note object to use for updating note in storage
	 * @return the newly updated note object
	 */
	@RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
	public Note update(@PathVariable Long id, @RequestBody Note note) {

		return noteService.update(id, note);
	}
}
