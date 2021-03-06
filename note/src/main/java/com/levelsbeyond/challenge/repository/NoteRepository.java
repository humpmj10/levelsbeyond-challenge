package com.levelsbeyond.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levelsbeyond.challenge.model.Note;

/**
 * 
 * @author michael.humphrey
 *
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
