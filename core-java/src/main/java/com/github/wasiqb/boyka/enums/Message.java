/*
 * MIT License
 *
 * Copyright (c) 2022 Wasiq Bhamla
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.github.wasiqb.boyka.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Different validation messages
 *
 * @author Wasiq Bhamla
 * @since 19-Feb-2022
 */
@AllArgsConstructor
@Getter
public enum Message {
    /**
     * Driver only supports Web application type
     */
    APP_TYPE_NOT_SUPPORTED ("Application type [{0}] is not yet supported..."),
    /**
     * Basic auth password is empty.
     */
    AUTH_PASSWORD_REQUIRED ("Basic auth password is required..."),
    /**
     * Remote execution requires capabilities
     */
    CAPABILITIES_REQUIRED_FOR_REMOTE ("Capabilities required for remote execution..."),
    /**
     * Config key is not found.
     */
    CONFIG_KEY_NOT_FOUND (
        "The key [{0}] mentioned is not found in the config file, please provide a valid keys from the following [{1}]..."),
    /**
     * Content type must be set before setting request body
     */
    CONTENT_TYPE_NOT_SET ("Content type must be set before setting request body..."),
    /**
     * Element not found.
     */
    ELEMENT_NOT_FOUND ("Element not found for locator {0}..."),
    /**
     * Empty browser is not allowed.
     */
    EMPTY_BROWSER_NOT_ALLOWED ("Browser type cannot be empty in the config..."),
    /**
     * Error while creating log file for a log type.
     */
    ERROR_CREATING_LOGS ("Error occurred while creating log file for log type: {}..."),
    /**
     * Error deleting log files.
     */
    ERROR_DELETING_LOGS ("Error deleting log files..."),
    /**
     * Deselect from dropdown Error.
     */
    ERROR_DESELECT_FROM_DROPDOWN ("Cannot deselect from dropdown, it should be Multi-select box..."),
    /**
     * Error executing request
     */
    ERROR_EXECUTING_REQUEST ("Error occurred while executing request..."),
    /**
     * Error occurred while parsing request body.
     */
    ERROR_PARSING_REQUEST_BODY ("Error occurred while parsing request body..."),
    /**
     * Parsing Error while parsing the response body.
     */
    ERROR_PARSING_RESPONSE_BODY ("Error occurred while parsing response body..."),
    /**
     * Error occurred while quitting driver.
     */
    ERROR_QUITTING_DRIVER ("Error quitting driver..."),
    /**
     * Error reading file
     */
    ERROR_READING_FILE ("Error occurred reading file [{0}]..."),
    /**
     * Error while saving screenshot.
     */
    ERROR_SAVING_SCREENSHOT ("Error saving screenshot"),
    /**
     * Error due to server not running.
     */
    ERROR_SERVER_NOT_RUNNING ("Error occurred, server not running: {0}..."),
    /**
     * Error starting Appium server.
     */
    ERROR_STARTING_SERVER ("Error occurred starting Appium server: {0}..."),
    /**
     * Error stopping Appium server.
     */
    ERROR_STOPPING_SERVER ("Error occurred stopping Appium server: {0}..."),
    /**
     * Error writing file
     */
    ERROR_WRITING_FILE ("Error occurred writing file [{0}]..."),
    /**
     * Error while writing logs to file.
     */
    ERROR_WRITING_LOGS ("Error occurred while writing logs..."),
    /**
     * Host name is required for Remote execution
     */
    HOSTNAME_REQUIRED_FOR_REMOTE ("Host name is required for remote driver execution..."),
    /**
     * Invalid browser selected
     */
    INVALID_BROWSER ("NONE Browser type is not allowed for Web platform..."),
    /**
     * No such key found
     */
    INVALID_HEADER_KEY ("No such key {0} found..."),
    /**
     * Invalid platform for operation
     */
    INVALID_PLATFORM_FOR_OPERATION ("Platform [{0}] is not supported for this setting..."),
    /**
     * Invalid Remote session URL.
     */
    INVALID_REMOTE_URL ("Invalid remote url generated..."),
    /**
     * Malformed JSON syntax error.
     */
    JSON_SYNTAX_ERROR ("JSON syntax error..."),
    /**
     * No API setting found
     */
    NO_API_SETTINGS_FOUND ("No settings found for API for key {0}..."),
    /**
     * Empty response body to parse as JsonPath.
     */
    NO_BODY_TO_PARSE ("No body to parse as JsonPath..."),
    /**
     * No JSON file found
     */
    NO_JSON_FILE_FOUND ("JSON file [{0}] not found..."),
    /**
     * Null remote url.
     */
    NULL_REMOTE_URL ("Remote URL is null..."),
    /**
     * Password required for cloud execution
     */
    PASSWORD_REQUIRED_FOR_CLOUD ("Password is required for cloud execution..."),
    /**
     * Protocol is required for host name
     */
    PROTOCOL_REQUIRED_FOR_HOST ("Protocol is required for host [{0}]..."),
    /**
     * Schema validation assert failure
     */
    RESPONSE_SCHEMA_NOT_MATCHING ("Schema validation assert failure..."),
    /**
     * Appium server already running.
     */
    SERVER_ALREADY_RUNNING ("Appium server already running..."),
    /**
     * Test Error.
     */
    TEST_ERROR ("Test error..."),
    /**
     * User name required for cloud execution
     */
    USER_NAME_REQUIRED_FOR_CLOUD ("User name is required for cloud execution...");

    private final String messageText;
}
