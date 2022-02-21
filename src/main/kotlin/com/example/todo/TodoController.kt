package com.example.todo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1")
class TodoController () {

    @GetMapping("/notes")
    fun getAllNotes(): ResponseEntity<List<NoteResponse>> {
        val notes = arrayListOf<NoteResponse>()
        return ResponseEntity.ok(notes)
    }

    @PostMapping("/note")
    fun createNote(@RequestBody noteRequest: NoteRequest): ResponseEntity<NoteResponse> {
        val note = NoteResponse(UUID.randomUUID().toString(),"TITLE")
        return ResponseEntity(note, HttpStatus.CREATED)
    }
}