package ccy.techchapterassignment.document;

import ccy.techchapterassignment.exception.DocumentNotFound;
import ccy.techchapterassignment.exception.TalentNotFound;
import ccy.techchapterassignment.talent.Talent;
import ccy.techchapterassignment.talent.TalentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final TalentRepository talentRepository;

    @Override
    public List<Document> getAllDocumentsByTalentId(String talentId) {
        talentRepository.findById(talentId).orElseThrow( () -> new TalentNotFound("Provided wrong talentId: " + talentId));

        List<Document> documentList = documentRepository.findAllByTalent_Uuid(talentId);
        if (documentList.isEmpty()) {
            throw new DocumentNotFound("No document found for talent with id: " + talentId);
        }

        return documentList;
    }

    @Override
    public Document getDocumentByTalentIdAndDocumentId(String talentId, String documentId) {
        talentRepository.findById(talentId).orElseThrow( () -> new TalentNotFound("Provided wrong talentId: " + talentId));

        return documentRepository.findByTalent_UuidAndUuid(talentId, documentId)
                .orElseThrow( () -> new DocumentNotFound("No document found with id: " + documentId));
    }
}
