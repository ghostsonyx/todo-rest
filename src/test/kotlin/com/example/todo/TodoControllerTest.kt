package com.example.todo

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import java.util.*

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class, MockitoExtension::class)
class TodoControllerTest @Autowired constructor(
    val mapper: ObjectMapper
) {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var respository: NoteRepository

    private val defaultNoteId = UUID.randomUUID().toString()

    @Test
    fun `should return all notes`() {
        val note = NoteResponse(defaultNoteId, "TITLE")
        val notes = arrayListOf(note)

        `when`(respository.findAll()).thenReturn(notes)

        mockMvc.get("/v1/notes") {
            contentType = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk() }
            content { json(mapper.writeValueAsString(notes)) }
        }
    }
}
