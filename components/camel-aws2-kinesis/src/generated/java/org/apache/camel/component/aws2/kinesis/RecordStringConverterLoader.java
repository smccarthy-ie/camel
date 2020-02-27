/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.kinesis;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class RecordStringConverterLoader implements TypeConverterLoader {

    public RecordStringConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        try {
            registerConverters(registry);
        } catch (Throwable e) {
            // ignore on load error
        }
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.String.class, software.amazon.awssdk.services.kinesis.model.Record.class, false,
            (type, exchange, value) -> org.apache.camel.component.aws2.kinesis.RecordStringConverter.toString((software.amazon.awssdk.services.kinesis.model.Record) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
