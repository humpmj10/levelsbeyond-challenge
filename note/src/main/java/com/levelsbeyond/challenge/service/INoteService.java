package com.levelsbeyond.challenge.service;

import com.levelsbeyond.challenge.model.Note;

public interface INoteService {

	public Note get(Long id);

	public Note delete(Long id);

	public Note update(Long id, Note note);

	public Note create(Long id);
}
