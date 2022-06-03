package com.giovann.composenotetesting.feature_note.domain.use_case

import com.giovann.composenotetesting.feature_note.domain.model.InvalidNoteException
import com.giovann.composenotetesting.feature_note.domain.model.Note
import com.giovann.composenotetesting.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repo: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repo.insertNote(note)
    }
}