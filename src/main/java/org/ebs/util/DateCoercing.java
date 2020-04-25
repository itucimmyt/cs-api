package org.ebs.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;

public class DateCoercing implements Coercing<Date, String> {

    protected DateTimeFormatter dateFormat = DateTimeFormatter.ISO_LOCAL_DATE.withZone(ZoneOffset.UTC);

    @Override
    public String serialize(Object dataFetcherResult) throws CoercingSerializeException {
        if(dataFetcherResult instanceof Date) {
            try{
                return  dateFormat.format(((Date)dataFetcherResult).toInstant());
            }catch(Exception ex) {
                throw new CoercingSerializeException("canot serialize Date", ex.getCause());
            }
        }
        throw new CoercingSerializeException("canot serialize Date object");
    }

    @Override
    public Date parseValue(Object input) throws CoercingParseValueException {
        if (input instanceof String){
            LocalDate o = LocalDate.parse((String)input, dateFormat);
            try{
                return Date.from( o.atStartOfDay(ZoneId.systemDefault()).toInstant());
            }catch(Exception e){
                throw new CoercingParseValueException("cannot parse Date: " + input, e.getCause());
            }
        } else {
            throw new CoercingParseValueException("cannot parse Date object: " + input);
        }
    }

    @Override
    public Date parseLiteral(Object input) throws CoercingParseLiteralException {
        if (input instanceof StringValue) {
            String s = ((StringValue)input).getValue();
            LocalDate o = LocalDate.parse(s, dateFormat);
            try{
                return Date.from( o.atStartOfDay(ZoneId.systemDefault()).toInstant());
            }catch(Exception e) {
                throw new CoercingParseLiteralException("cannot parse literal Date: " + input, e.getCause());
            }
        } else {
            throw new CoercingParseLiteralException("cannot parse literal Date object: " + input);
        }
    }
}