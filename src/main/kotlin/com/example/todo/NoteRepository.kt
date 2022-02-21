package com.example.todo

import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository : MongoRepository<NoteResponse, String> {
}