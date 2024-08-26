package local.app.service;

import local.app.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDocumentService extends IGenericService<Document> {
    Page<Document> findAll(Pageable pageable);
    Page<Document> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
