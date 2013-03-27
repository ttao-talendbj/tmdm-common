/*
 * Copyright (C) 2006-2013 Talend Inc. - www.talend.com
 *
 * This source code is available under agreement available at
 * %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
 *
 * You should have received a copy of the agreement
 * along with this program; if not, write to Talend SA
 * 9 rue Pages 92150 Suresnes, France
 */

package org.talend.mdm.commmon.metadata;

/**
 *
 */
public enum ValidationError {
    XML_SCHEMA,
    ENTITY_CANNOT_INHERIT_FROM_REUSABLE_TYPE,
    FIELD_KEY_CANNOT_BE_REPEATABLE,
    FOREIGN_KEY_NOT_STRING_TYPED,
    MULTIPLE_INHERITANCE_NOT_ALLOWED,
    PRIMARY_KEY_INFO_NOT_IN_ENTITY,
    PRIMARY_KEY_INFO_CANNOT_BE_REPEATABLE,
    TYPE_DOES_NOT_EXIST,
    TYPE_DOES_NOT_OWN_FIELD,
    TYPE_DOES_NOT_OWN_KEY,
    LOOKUP_FIELD_NOT_IN_ENTITY,
    LOOKUP_FIELD_CANNOT_BE_KEY,
    LOOKUP_FIELD_MUST_BE_SIMPLE_TYPE,
    PRIMARY_KEY_INFO_TYPE_NOT_PRIMITIVE,
    TYPE_CANNOT_OVERRIDE_SUPER_TYPE_KEY,
    FOREIGN_KEY_INFO_REPEATABLE,
    FOREIGN_KEY_INFO_NOT_STRING_TYPED
}