package ccy.techchapterassignment.document;

import java.util.List;

public interface DocumentService {

    List<Document> getAllDocuments();

    Document getDocumentBy(String uuid);
}
