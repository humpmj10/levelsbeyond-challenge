package com.levelsbeyond.challenge.service;

import java.util.List;

import com.levelsbeyond.challenge.model.Note;

/**
 * 
 * @author michael.humphrey
 *
 */
public interface INoteService {

	/**
	 * Get one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the note retrieved from storage
	 */
	public Note get(Long id);

	/**
	 * Delete one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the deleted note
	 */
	public Note delete(Long id);

	/**
	 * 
	 * @param id
	 *            the id of the note
	 * @param note
	 *            the note object to use for updating note in storage
	 * @return the newly updated note object
	 */
	public Note update(Long id, Note note);

	/**
	 * 
	 * @param note
	 *            the note object to use for creating a new note in storage
	 * @return the newly created note
	 */
	public Note create(Note note);

	/**
	 * Get all notes that are currently in storage
	 * 
	 * @return the list of notes in storage
	 */
	public List<Note> list(String requestQuery);

}
