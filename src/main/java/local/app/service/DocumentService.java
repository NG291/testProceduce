package local.app.service;


import local.app.model.Document;
import local.app.repository.IDocumentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DocumentService implements IDocumentService {
    private final IDocumentRepository documentRepository;

    public DocumentService(IDocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public void delete(Document document) {
        documentRepository.delete(document);
    }

    @Override
    public Page<Document> findAll(Pageable pageable) {
        return documentRepository.findAll(pageable);
    }

    @Override
    public Page<Document> findByNameContainingIgnoreCase(String name, Pageable pageable) {
        if (name == null || name.isEmpty()) {
            return findAll(pageable);
        }
        return documentRepository.findByNameContainingIgnoreCase(name, pageable);
    }

    @Override
    public Document findById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Document document) {
        documentRepository.save(document);
    }
}
