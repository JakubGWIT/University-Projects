package org.example.pl.edu.wit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.pl.edu.wit.SampleDefaultDocument.DEFAULT_DOCUMENT_EXPIRATION_DATE;
import static org.example.pl.edu.wit.SampleDefaultDocument.DEFAULT_DOCUMENT_ISSUE_DATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("document unit tests")
class DocumentTest {

    @Test
    @DisplayName("should create document without expiration date")
    void shouldCreateDocumentWithoutExpirationDate() {

        //when
        Document document = Document.create(SampleDefaultDocument.DEFAULT_DOCUMENT_NUMBER, DEFAULT_DOCUMENT_ISSUE_DATE);

        //then
        Assertions.assertNotNull(document);
        assertEquals(SampleDefaultDocument.DEFAULT_DOCUMENT_NUMBER, document.getNumber());
        assertEquals(DEFAULT_DOCUMENT_ISSUE_DATE, document.getIssueAt());
        Assertions.assertNull(document.getExpireAt());
    }

    @Test
    @DisplayName("should create document with expiration date")
    void shouldCreateDocumentWithExpirationDate() {

        //when
        Document document = Document.create(DEFAULT_DOCUMENT_EXPIRATION_DATE, SampleDefaultDocument.DEFAULT_DOCUMENT_NUMBER, DEFAULT_DOCUMENT_ISSUE_DATE);

        //then
        Assertions.assertNotNull(document);
        assertEquals(SampleDefaultDocument.DEFAULT_DOCUMENT_NUMBER, document.getNumber());
        assertEquals(DEFAULT_DOCUMENT_ISSUE_DATE, document.getIssueAt());
        assertEquals(DEFAULT_DOCUMENT_EXPIRATION_DATE, document.getExpireAt());
    }
}