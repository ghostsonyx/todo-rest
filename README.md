# todo-rest
Backend REST service to serve up example TODO notes/lists for your day to day life.

### **Work in Progress**
This repo is a work in progress to learn kotlin and expose this data from a cloud vendor which connects to a cloud mongo database. This repo will be exposing information
to the internet using REST protocols to be consumed from an Android application [todo-client](https://github.com/ghostsonyx/todo-client)

`GET /v1/notes`

Example Response
```
[
    {
        "id": "0ccd2335-0432-4148-9855-82b273cde5c4",
        "title": "TEST_NOTE",
        "list": [],
        "creationDate": "2022-02-21T05:32:44.302",
        "revisionDate": "2022-02-21T05:32:44.302"
    },
    {
        "id": "f07d0c16-384d-45d2-9153-df46993d178f",
        "title": "TEST_NOTE_2",
        "list": [],
        "creationDate": "2022-02-22T01:56:16.927",
        "revisionDate": "2022-02-22T01:56:16.927"
    },
    {
        "id": "23ecff68-c218-49d1-b36a-619854bc07ea",
        "title": "TEST_NOTE_3",
        "list": [],
        "creationDate": "2022-02-22T01:56:36.036",
        "revisionDate": "2022-02-22T01:56:36.036"
    },
    {
        "id": "535e94bb-eaf6-4a98-ba32-9b28bdb77a32",
        "title": "TEST_NOTE_4",
        "list": [],
        "creationDate": "2022-02-22T01:56:40.393",
        "revisionDate": "2022-02-22T01:56:40.393"
    }
]
```
