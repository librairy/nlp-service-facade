/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.nlp.facade.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface NlpService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"NlpService\",\"namespace\":\"org.librairy.service.nlp.facade.model\",\"types\":[{\"type\":\"enum\",\"name\":\"PoS\",\"symbols\":[\"NOUN\",\"VERB\",\"ADJECTIVE\",\"ADVERB\",\"PRONOUN\",\"PREPOSITION\",\"CONJUNCTION\",\"INTERJECTION\",\"ARTICLE\"]},{\"type\":\"enum\",\"name\":\"Domain\",\"symbols\":[\"WORDNET\",\"DBPEDIA\",\"EUROVOC\"]},{\"type\":\"enum\",\"name\":\"Form\",\"symbols\":[\"RAW\",\"LEMMA\"]},{\"type\":\"record\",\"name\":\"Token\",\"fields\":[{\"name\":\"target\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"order\":\"ignore\"},{\"name\":\"lemma\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"morphoFeat\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"pos\",\"type\":\"PoS\",\"order\":\"ignore\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"}]},{\"type\":\"record\",\"name\":\"Annotation\",\"fields\":[{\"name\":\"token\",\"type\":\"Token\"},{\"name\":\"offset\",\"type\":\"long\",\"order\":\"ignore\"},{\"name\":\"sentiment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"uri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"}]},{\"type\":\"record\",\"name\":\"Group\",\"fields\":[{\"name\":\"token\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"pos\",\"type\":\"PoS\",\"order\":\"ignore\"},{\"name\":\"uri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"freq\",\"type\":\"long\",\"order\":\"ignore\"}]}],\"messages\":{\"tokens\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"filter\",\"type\":{\"type\":\"array\",\"items\":\"PoS\"}},{\"name\":\"form\",\"type\":\"Form\"},{\"name\":\"domain\",\"type\":\"Domain\"}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"annotations\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"filter\",\"type\":{\"type\":\"array\",\"items\":\"PoS\"}},{\"name\":\"domain\",\"type\":\"Domain\"}],\"response\":{\"type\":\"array\",\"items\":\"Annotation\"}},\"groups\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"filter\",\"type\":{\"type\":\"array\",\"items\":\"PoS\"}},{\"name\":\"domain\",\"type\":\"Domain\"}],\"response\":{\"type\":\"array\",\"items\":\"Group\"}}}}");
  java.lang.String tokens(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Form form, org.librairy.service.nlp.facade.model.Domain domain) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.nlp.facade.model.Annotation> annotations(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Domain domain) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.nlp.facade.model.Group> groups(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Domain domain) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends NlpService {
    public static final org.apache.avro.Protocol PROTOCOL = org.librairy.service.nlp.facade.model.NlpService.PROTOCOL;
    void tokens(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Form form, org.librairy.service.nlp.facade.model.Domain domain, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void annotations(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Domain domain, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.nlp.facade.model.Annotation>> callback) throws java.io.IOException;
    void groups(java.lang.String text, java.util.List<org.librairy.service.nlp.facade.model.PoS> filter, org.librairy.service.nlp.facade.model.Domain domain, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.nlp.facade.model.Group>> callback) throws java.io.IOException;
  }
}