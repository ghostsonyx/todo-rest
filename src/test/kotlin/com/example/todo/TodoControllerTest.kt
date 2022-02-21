package com.example.todo

/*
@SpringBootTest
@AutoConfigureMockMvc // TODO figure out why mockmvc tries to connect to a real database
internal class TodoControllerTest @Autowired constructor(
    val mvc: MockMvc,
    val mapper: ObjectMapper
) {
    private val defaultNoteId = UUID.randomUUID().toString()

    @Test
    fun `should return all notes`() {
        val note = NoteResponse(defaultNoteId, "TITLE")
        val notes = arrayListOf(note)

        mvc.get("/v1/notes") {
            contentType = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk() }
            content { json(mapper.writeValueAsString(notes)) }
        }
    }
}*/
