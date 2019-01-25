package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.nlp.facade.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        NlpService customService = new NlpService() {
            @Override
            public String tokens(String text, List<PoS> filter, Form form, Domain domain) throws AvroRemoteException {
                return "text processed";
            }

            @Override
            public List<Annotation> annotations(String text, List<PoS> filter, Domain domain) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Group> groups(String text, List<PoS> filter, Domain domain) throws AvroRemoteException {
                return Collections.emptyList();
            }

        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        List<String> texts = Arrays.asList(new String[]{"example 1", "example 2", "example 3"});


        texts.forEach(text -> {
            try {
                client.tokens(text, Arrays.asList(new PoS[]{PoS.NOUN, PoS.VERB}), Form.RAW, Domain.GENERAL);
                client.annotations(text, Collections.emptyList(), Domain.GENERAL);
                client.groups(text, Arrays.asList(new PoS[]{PoS.NOUN, PoS.VERB}), Form.RAW, Domain.GENERAL);
            } catch (AvroRemoteException e) {
                e.printStackTrace();
            }
        });

        client.close();
        server.close();
    }

}
