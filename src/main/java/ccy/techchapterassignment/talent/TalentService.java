package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.document.DocumentDto;

import java.util.List;

public interface TalentService {

    List<Talent> getAllTalents();

    Talent getTalentBy(String uuid);

    List<DocumentDto> getAllDocumentsByTalentId(String talentId);

    DocumentDto getDocumentByTalentIdAndDocumentId(String talentId, String documentId);
}
