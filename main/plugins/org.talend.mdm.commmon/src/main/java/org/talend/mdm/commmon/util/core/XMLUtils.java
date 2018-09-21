/*
 * Copyright (C) 2006-2018 Talend Inc. - www.talend.com
 * 
 * This source code is available under agreement available at
 * %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
 * 
 * You should have received a copy of the agreement along with this program; if not, write to Talend SA 9 rue Pages
 * 92150 Suresnes, France
 */

package org.talend.mdm.commmon.util.core;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class XMLUtils {

    private static final Logger LOGGER = Logger.getLogger(XMLUtils.class);

    public static boolean isExistExtEntity(InputStream stream) {
        boolean results = false;
        try {
            String result = new BufferedReader(new InputStreamReader(stream))
                    .lines().collect(Collectors.joining(System.lineSeparator()));
            results = isExistExtEntity(result);
        } catch (Exception e) {
            LOGGER.error("An unexpected exception occurred." + e);
        }
        return results;
    }

    /**
     * Take a security measurements against XML external entity attacks.
     *  {"<!ENTITY desc SYSTEM \"ect/passwd\">,
     * "<!ENTITY desc SYSTEM>", "<!ENTITY desc public>", "<!ENTITY desc system \"file:abc.txt\">", "<!ENTITY desc public
     * \"http://www.baidu.com\">", "<!ENTITY abc public>", "<!entity public \"http://www.baidu.com\">", }
     * 
     * @param rawXml
     * @return
     */
    public static boolean isExistExtEntity(String rawXml) {
        if (rawXml == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("<!ENTITY\\s+\\S*\\s+[SYSTEM|PUBLIC]{1}.+?>", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(rawXml);
        return matcher.find();
    }
}
