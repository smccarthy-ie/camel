/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class PulsarEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":persistence://tenant/namespace/topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(45);
        props.add("ackGroupTimeMillis");
        props.add("ackTimeoutMillis");
        props.add("ackTimeoutRedeliveryBackoff");
        props.add("allowManualAcknowledgement");
        props.add("authenticationClass");
        props.add("authenticationParams");
        props.add("batcherBuilder");
        props.add("batchingEnabled");
        props.add("batchingMaxMessages");
        props.add("batchingMaxPublishDelayMicros");
        props.add("blockIfQueueFull");
        props.add("bridgeErrorHandler");
        props.add("chunkingEnabled");
        props.add("compressionType");
        props.add("consumerName");
        props.add("consumerNamePrefix");
        props.add("consumerQueueSize");
        props.add("deadLetterTopic");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("initialSequenceId");
        props.add("lazyStartProducer");
        props.add("maxPendingMessages");
        props.add("maxPendingMessagesAcrossPartitions");
        props.add("maxRedeliverCount");
        props.add("messageListener");
        props.add("messageRouter");
        props.add("messageRoutingMode");
        props.add("namespace");
        props.add("negativeAckRedeliveryBackoff");
        props.add("negativeAckRedeliveryDelayMicros");
        props.add("numberOfConsumerThreads");
        props.add("numberOfConsumers");
        props.add("persistence");
        props.add("producerName");
        props.add("readCompacted");
        props.add("sendTimeoutMs");
        props.add("serviceUrl");
        props.add("subscriptionInitialPosition");
        props.add("subscriptionName");
        props.add("subscriptionTopicsMode");
        props.add("subscriptionType");
        props.add("tenant");
        props.add("topic");
        props.add("topicsPattern");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "pulsar".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "persistence", null, true, copy);
        uri = buildPathParameter(syntax, uri, "tenant", null, true, copy);
        uri = buildPathParameter(syntax, uri, "namespace", null, true, copy);
        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

