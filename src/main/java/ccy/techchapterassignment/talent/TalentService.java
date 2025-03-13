package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.document.Document;

import java.util.List;

public interface TalentService {

    List<Talent> getAllTalents();

    Talent getTalentBy(String uuid);

    List<Document> getAllDocumentsByTalentId(String talentId);

    Document getDocumentByTalentIdAndDocumentId(String talentId, String documentId);
}
