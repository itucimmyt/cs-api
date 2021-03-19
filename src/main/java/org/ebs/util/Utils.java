package org.ebs.util;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    private static final String GEOJSON_TEMPLATE="{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{},\"geometry\":{\"type\":\"{geometry}\",\"coordinates\":[{coordinates}]}}]}";

    private static String[] getNullPropertyNames(Object source) {
        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
        return Stream.of(wrappedSource.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
                .toArray(String[]::new);
    }

    /**
     * Copy properties between beans which are not null values in the source
     * @param source object to be copied
     * @param target object receiving the copied values
     */
    public static void copyNotNulls(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }


    /**
     * Returns a valid geojson object with the following structure: 1 Feature Collection, with one Feature and one Geometry.
     * The geometry type is set based on the number of coordinates provided
     * @param coordinaes in a postgreSQL notation. Example: "((33.9447710680755,-9.55896224165781))"
     * @return the geojson representation of the coordinates
     */
    public static String rawGeojsonFromCoordinates(String coordinates) {
        // TODO verify how database is storing real polygon coordinates
        String coords =  coordinates.replaceAll("\\(", "[").replaceAll("\\)", "]");
        int numCoords = coordinates.split(",").length;

        return GEOJSON_TEMPLATE.replace("{coordinates}", coords)
            .replace("{geometry}", numCoords == 2 ? "Point" : "Polygon");
    }
}