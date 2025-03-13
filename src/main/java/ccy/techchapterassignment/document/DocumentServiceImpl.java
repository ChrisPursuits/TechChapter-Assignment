package ccy.techchapterassignment.document;

import ccy.techchapterassignment.exception.DocumentNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Override
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public Document getDocumentBy(String uuid) {
        return documentRepository.findById(uuid).orElseThrow( () -> new DocumentNotFound("No document found with id: " + uuid));
    }
}
