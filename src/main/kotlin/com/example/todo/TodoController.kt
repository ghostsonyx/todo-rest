package com.example.todo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1")
class TodoController (
    private val noteRepository: NoteRepository) {

    @GetMapping("/notes")
    fun getAllNotes(): ResponseEntity<List<NoteResponse>> {
        val notes = noteRepository.findAll()
        return ResponseEntity.ok(notes)
    }

    @PostMapping("/note")
    fun createNote(@RequestBody noteRequest: NoteRequest): ResponseEntity<NoteResponse> {
        val note = noteRepository.save(NoteResponse(
            title = noteRequest.title
        ))
        return ResponseEntity(note, HttpStatus.CREATED)
    }
}