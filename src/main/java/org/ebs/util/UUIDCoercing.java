package org.ebs.util;

import java.util.UUID;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;

public class UUIDCoercing implements Coercing<UUID, String> {

    @Override
    public String serialize(Object dataFetcherResult) throws CoercingSerializeException {
        if(dataFetcherResult instanceof UUID) {
            try{
                return  ((UUID)dataFetcherResult).toString();
            }catch(Exception ex) {
                throw new CoercingSerializeException("canot serialize UUID", ex.getCause());
            }
        }
        throw new CoercingSerializeException("canot serialize UUID object");
    }

    @Override
    public UUID parseValue(Object input) throws CoercingParseValueException {
        if (input instanceof String){
            try{
                return UUID.fromString((String)input);
            }catch(Exception e){
                throw new CoercingParseValueException("cannot parse UUID: " + input, e.getCause());
            }
        } else {
            throw new CoercingParseValueException("cannot parse UUID object: " + input);
        }
    }

    @Override
    public UUID parseLiteral(Object input) throws CoercingParseLiteralException {
        if (input instanceof StringValue) {
            try{
                return UUID.fromString(((StringValue)input).getValue());
            }catch(Exception e) {
                throw new CoercingParseLiteralException("cannot parse literal UUID: " + input, e.getCause());
            }
        } else {
            throw new CoercingParseLiteralException("cannot parse literal UUID object: " + input);
        }
    }
}