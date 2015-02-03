package com.webarch.srmobile.parsers;

/**
 * @author Manoj khanna
 */

public class ParserException extends Exception {

    public ParserException(Parser parser, String moduleName) {
        super(parser.getClass().getSimpleName() + ": " + moduleName);
    }

}