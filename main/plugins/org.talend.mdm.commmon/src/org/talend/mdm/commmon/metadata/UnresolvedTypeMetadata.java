/*
 * Copyright (C) 2006-2014 Talend Inc. - www.talend.com
 *
 * This source code is available under agreement available at
 * %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
 *
 * You should have received a copy of the agreement
 * along with this program; if not, write to Talend SA
 * 9 rue Pages 92150 Suresnes, France
 */

package org.talend.mdm.commmon.metadata;

import org.apache.commons.lang.StringUtils;
import org.talend.mdm.commmon.metadata.validation.ValidationFactory;
import org.talend.mdm.commmon.metadata.validation.ValidationRule;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnresolvedTypeMetadata extends MetadataExtensions implements ComplexTypeMetadata {

    private final String typeName;

    public UnresolvedTypeMetadata(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public Collection<TypeMetadata> getSuperTypes() {
        return Collections.emptyList();
    }

    @Override
    public void addSuperType(TypeMetadata superType, MetadataRepository repository) {
    }

    @Override
    public String getName() {
        return typeName;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public String getNamespace() {
        return StringUtils.EMPTY;
    }

    @Override
    public boolean isAssignableFrom(TypeMetadata type) {
        return false;
    }

    @Override
    public TypeMetadata copy(MetadataRepository repository) {
        return this;
    }

    @Override
    public TypeMetadata copyShallow() {
        return this;
    }

    @Override
    public TypeMetadata freeze() {
        return this;
    }

    @Override
    public boolean isInstantiable() {
        return true;
    }

    @Override
    public void setInstantiable(boolean isInstantiable) {
    }

    @Override
    public boolean isFrozen() {
        return true;
    }

    @Override
    public void validate(ValidationHandler handler) {
        ValidationFactory.getRule(this).perform(handler);
    }

    @Override
    public ValidationRule createValidationRule() {
        return ValidationFactory.getRule(this);
    }

    @Override
    public <T> T accept(MetadataVisitor<T> visitor) {
        return null;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public Collection<FieldMetadata> getKeyFields() {
        return Collections.emptyList();
    }

    @Override
    public void registerKey(FieldMetadata keyField) {
    }

    @Override
    public FieldMetadata getField(String fieldName) {
        return null;
    }

    @Override
    public Collection<FieldMetadata> getFields() {
        return Collections.emptyList();
    }

    @Override
    public void addField(FieldMetadata fieldMetadata) {
    }

    @Override
    public List<String> getWriteUsers() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getHideUsers() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getDenyCreate() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getDenyDelete(DeleteType type) {
        return Collections.emptyList();
    }

    @Override
    public String getSchematron() {
        return StringUtils.EMPTY;
    }

    @Override
    public List<FieldMetadata> getPrimaryKeyInfo() {
        return Collections.emptyList();
    }

    @Override
    public boolean hasField(String fieldName) {
        return false;
    }

    @Override
    public Collection<ComplexTypeMetadata> getSubTypes() {
        return Collections.emptyList();
    }

    @Override
    public void registerSubType(ComplexTypeMetadata type) {
    }

    @Override
    public List<FieldMetadata> getLookupFields() {
        return Collections.emptyList();
    }
}