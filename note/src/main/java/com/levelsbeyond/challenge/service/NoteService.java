package com.levelsbeyond.challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.levelsbeyond.challenge.model.Note;
import com.levelsbeyond.challenge.repository.NoteRepository;

/**
 * 
 * @author michael.humphrey
 *
 */
@Transactional
public class NoteService implements INoteService {

	@Autowired
	private NoteRepository noteRepository;

	/**
	 * Get all notes that are currently in storage
	 * 
	 * @return the list of notes in storage
	 */
	public List<Note> list(String requestQuery) {

		List<Note> notes = noteRepository.findAll();
		List<Note> result = new ArrayList<Note>();

		if (requestQuery != "") {
			for (Note note : notes) {
				if (note.getBody().contains(requestQuery)) {
					result.add(note);
				}
			}
		} else {
			result = notes;
		}

		return result;

	}

	/**
	 * 
	 * @param note
	 *            the note object to use for creating a new note in storage
	 * @return the newly created note
	 */
	public Note create(Note note) {

		return noteRepository.saveAndFlush(note);
	}

	/**
	 * Delete one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the deleted note
	 */
	public Note delete(Long id) {

		Note existingNote = noteRepository.findOne(id);
		noteRepository.delete(existingNote);
		return existingNote;
	}

	/**
	 * Get one specific note from storage
	 * 
	 * @param id
	 *            the id of the note
	 * @return the note retrieved from storage
	 */
	public Note get(Long id) {

		return noteRepository.findOne(id);
	}

	/**
	 * 
	 * @param id
	 *            the id of the note
	 * @param note
	 *            the note object to use for updating note in storage
	 * @return the newly updated note object
	 */
	public Note update(Long id, Note note) {

		Note existingNote = noteRepository.findOne(id);
		BeanUtils.copyProperties(note, existingNote);
		return noteRepository.saveAndFlush(existingNote);
	}
}
