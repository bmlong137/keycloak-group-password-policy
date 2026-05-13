package com.github.jpicht.keycloak.policy;

import java.util.stream.Stream;

import org.keycloak.models.RequiredActionConfigModel;
import org.keycloak.representations.idm.RealmRepresentation.BruteForceStrategy;

/**
 * This is only for methods whose signatures require Keycloak v26 or later.
 * 
 * @author brian@inteligr8.com
 */
public interface UnsupportedRealmV26 extends UnsupportedRealmV25 {

    default BruteForceStrategy getBruteForceStrategy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default void setBruteForceStrategy(BruteForceStrategy val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}