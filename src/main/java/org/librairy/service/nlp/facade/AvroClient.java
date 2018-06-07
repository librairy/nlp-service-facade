package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.nlp.facade.model.*;
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

    public String tokens(String text, List<PoS> filter, Form form, Boolean multigrams) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.tokens with message:  \"" + text +"\" , filter: " + filter + ", form: " + form + ", multigrams: " + multigrams);
        CharSequence result = proxy.tokens(text, filter, form, multigrams);
        LOG.debug("Result: " + result);
        return result.toString();
    }

    public List<Annotation> annotations(String text, List<PoS> filter, Boolean multigrams, Boolean references) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.annotations with message:  \"" + text +"\" , filter: " + filter + ", multigrams: " + multigrams + ", references:" + references);
        List<Annotation> annotations = proxy.annotations(text, filter, multigrams, references);
        LOG.debug("Result: " + annotations);
        return annotations;
    }

    public List<Group> groups(String text, List<PoS> filter, Form form, Boolean multigrams, Boolean references) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.groups with message:  \"" + text +"\" , filter: " + filter + ", form: " + form + ", multigrams: " + multigrams + ", references:" + references);
        List<Group> result = proxy.groups(text, filter, multigrams, references);
        LOG.debug("Result: " + result);
        return result;
    }
}
