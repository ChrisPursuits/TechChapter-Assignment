package ccy.techchapterassignment.document;

import java.util.List;

public interface DocumentService {

    List<Document> getAllDocumentsByTalentId(String talentId);

    Document getDocumentByTalentIdAndDocumentId(String talentId, String documentId);
}
