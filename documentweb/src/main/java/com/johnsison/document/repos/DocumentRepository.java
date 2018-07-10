package com.johnsison.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
