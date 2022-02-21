package com.example.todo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

@Document(collection = "notes")
data class NoteResponse (
    @Id
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val list: ArrayList<String> = arrayListOf(), // TODO Require in the future
    val creationDate: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),
    val revisionDate: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC)
)