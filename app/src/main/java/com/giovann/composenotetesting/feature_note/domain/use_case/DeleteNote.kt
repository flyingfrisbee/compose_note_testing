package com.giovann.composenotetesting.feature_note.domain.use_case

import com.giovann.composenotetesting.feature_note.domain.model.Note
import com.giovann.composenotetesting.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repo: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repo.deleteNote(note)
    }
}