package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.nlp.facade.model.Annotation;
import org.librairy.service.nlp.facade.model.Form;
import org.librairy.service.nlp.facade.model.NlpService;
import org.librairy.service.nlp.facade.model.PoS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    NlpService proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (NlpService) SpecificRequestor.getClient(NlpService.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public String process(String text, List<PoS> filter, Form form) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.process with message:  \"" + text +"\" , filter: " + filter + ", form: " + form);
        CharSequence result = proxy.process(text, filter, form);
        LOG.debug("Result: " + result);
        return result.toString();
    }

    public List<Annotation> annotate(String text, List<PoS> filter) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.annotate with message:  \"" + text +"\" , filter: " + filter);
        List<Annotation> annotations = proxy.annotate(text, filter);
        LOG.debug("Result: " + annotations);
        return annotations;
    }
}
