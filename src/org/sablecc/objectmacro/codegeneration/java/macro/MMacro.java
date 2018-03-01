/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MMacro {

    private final String pName;

    private final MMacro mMacro = this;

    private final List<Object> ePackageDeclaration = new LinkedList<>();

    private final List<Object> eImportJavaUtil = new LinkedList<>();

    private final List<Object> eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
            = new LinkedList<>();

    private final List<Object> eContextField = new LinkedList<>();

    private final List<Object> eConstructor = new LinkedList<>();

    private final List<Object> eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
            = new LinkedList<>();

    private final List<Object> eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
            = new LinkedList<>();

    private final List<Object> eParamStringRef_ParamMacroRef_InternalMacroRef
            = new LinkedList<>();

    private final List<Object> eInitInternalsMethod = new LinkedList<>();

    private final List<Object> eInitDirectives = new LinkedList<>();

    private final List<Object> eRedefinedApplyInitializer = new LinkedList<>();

    private final List<Object> eMacroBuilder = new LinkedList<>();

    private final List<Object> eEmptyBuilderWithContext = new LinkedList<>();

    public MMacro(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MPackageDeclaration newPackageDeclaration(
            String pPackageName) {

        MPackageDeclaration lPackageDeclaration
                = new MPackageDeclaration(pPackageName);
        this.ePackageDeclaration.add(lPackageDeclaration);
        return lPackageDeclaration;
    }

    public MImportJavaUtil newImportJavaUtil() {

        MImportJavaUtil lImportJavaUtil = new MImportJavaUtil();
        this.eImportJavaUtil.add(lImportJavaUtil);
        return lImportJavaUtil;
    }

    public MParamMacroField newParamMacroField(
            String pName) {

        MParamMacroField lParamMacroField = new MParamMacroField(pName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lParamMacroField);
        return lParamMacroField;
    }

    public MParamStringField newParamStringField(
            String pName) {

        MParamStringField lParamStringField = new MParamStringField(pName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lParamStringField);
        return lParamStringField;
    }

    public MInternalMacroField newInternalMacroField(
            String pName) {

        MInternalMacroField lInternalMacroField
                = new MInternalMacroField(pName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lInternalMacroField);
        return lInternalMacroField;
    }

    public MInternalStringField newInternalStringField(
            String pName) {

        MInternalStringField lInternalStringField
                = new MInternalStringField(pName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lInternalStringField);
        return lInternalStringField;
    }

    public MInternalMacrosValueField newInternalMacrosValueField(
            String pParamName) {

        MInternalMacrosValueField lInternalMacrosValueField
                = new MInternalMacrosValueField(pParamName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lInternalMacrosValueField);
        return lInternalMacrosValueField;
    }

    public MDirectiveFields newDirectiveFields(
            String pParamName) {

        MDirectiveFields lDirectiveFields = new MDirectiveFields(pParamName);
        this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .add(lDirectiveFields);
        return lDirectiveFields;
    }

    public MContextField newContextField(
            String pName) {

        MContextField lContextField = new MContextField(pName);
        this.eContextField.add(lContextField);
        return lContextField;
    }

    public MConstructor newConstructor(
            String pName) {

        MConstructor lConstructor = new MConstructor(pName);
        this.eConstructor.add(lConstructor);
        return lConstructor;
    }

    public MParamStringSetter newParamStringSetter(
            String pName) {

        MParamStringSetter lParamStringSetter = new MParamStringSetter(pName);
        this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                .add(lParamStringSetter);
        return lParamStringSetter;
    }

    public MSingleAdd newSingleAdd(
            String pMacroName,
            String pParamName) {

        MSingleAdd lSingleAdd = new MSingleAdd(pMacroName, pParamName);
        this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                .add(lSingleAdd);
        return lSingleAdd;
    }

    public MInternalStringSetter newInternalStringSetter(
            String pName) {

        MInternalStringSetter lInternalStringSetter
                = new MInternalStringSetter(pName);
        this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                .add(lInternalStringSetter);
        return lInternalStringSetter;
    }

    public MInternalMacroSetter newInternalMacroSetter(
            String pParamName) {

        MInternalMacroSetter lInternalMacroSetter
                = new MInternalMacroSetter(pParamName);
        this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                .add(lInternalMacroSetter);
        return lInternalMacroSetter;
    }

    public MParamStringRefBuilder newParamStringRefBuilder(
            String pName) {

        MParamStringRefBuilder lParamStringRefBuilder
                = new MParamStringRefBuilder(pName);
        this.eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
                .add(lParamStringRefBuilder);
        return lParamStringRefBuilder;
    }

    public MParamMacroRefBuilder newParamMacroRefBuilder(
            String pName) {

        MParamMacroRefBuilder lParamMacroRefBuilder
                = new MParamMacroRefBuilder(pName);
        this.eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
                .add(lParamMacroRefBuilder);
        return lParamMacroRefBuilder;
    }

    public MInternalMacroRefBuilder newInternalMacroRefBuilder(
            String pInternalName) {

        MInternalMacroRefBuilder lInternalMacroRefBuilder
                = new MInternalMacroRefBuilder(pInternalName);
        this.eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
                .add(lInternalMacroRefBuilder);
        return lInternalMacroRefBuilder;
    }

    public MParamStringRef newParamStringRef(
            String pName) {

        MParamStringRef lParamStringRef = new MParamStringRef(pName);
        this.eParamStringRef_ParamMacroRef_InternalMacroRef
                .add(lParamStringRef);
        return lParamStringRef;
    }

    public MParamMacroRef newParamMacroRef(
            String pName) {

        MParamMacroRef lParamMacroRef = new MParamMacroRef(pName);
        this.eParamStringRef_ParamMacroRef_InternalMacroRef.add(lParamMacroRef);
        return lParamMacroRef;
    }

    public MInternalMacroRef newInternalMacroRef(
            String pParamName) {

        MInternalMacroRef lInternalMacroRef = new MInternalMacroRef(pParamName);
        this.eParamStringRef_ParamMacroRef_InternalMacroRef
                .add(lInternalMacroRef);
        return lInternalMacroRef;
    }

    public MInitInternalsMethod newInitInternalsMethod(
            String pName) {

        MInitInternalsMethod lInitInternalsMethod
                = new MInitInternalsMethod(pName);
        this.eInitInternalsMethod.add(lInitInternalsMethod);
        return lInitInternalsMethod;
    }

    public MInitDirectives newInitDirectives(
            String pParamName) {

        MInitDirectives lInitDirectives = new MInitDirectives(pParamName);
        this.eInitDirectives.add(lInitDirectives);
        return lInitDirectives;
    }

    public MRedefinedApplyInitializer newRedefinedApplyInitializer(
            String pName) {

        MRedefinedApplyInitializer lRedefinedApplyInitializer
                = new MRedefinedApplyInitializer(pName);
        this.eRedefinedApplyInitializer.add(lRedefinedApplyInitializer);
        return lRedefinedApplyInitializer;
    }

    public MMacroBuilder newMacroBuilder(
            String pMacroName) {

        MMacroBuilder lMacroBuilder = new MMacroBuilder(pMacroName);
        this.eMacroBuilder.add(lMacroBuilder);
        return lMacroBuilder;
    }

    public MEmptyBuilderWithContext newEmptyBuilderWithContext() {

        MEmptyBuilderWithContext lEmptyBuilderWithContext
                = new MEmptyBuilderWithContext();
        this.eEmptyBuilderWithContext.add(lEmptyBuilderWithContext);
        return lEmptyBuilderWithContext;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mMacro.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.ePackageDeclaration.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oPackageDeclaration : this.ePackageDeclaration) {
            sb.append(oPackageDeclaration.toString());
        }
        if (this.eImportJavaUtil.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oImportJavaUtil : this.eImportJavaUtil) {
            sb.append(oImportJavaUtil.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("public class M");
        sb.append(rName());
        sb.append(" extends Macro{");
        sb.append(System.getProperty("line.separator"));
        if (this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                .size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields : this.eParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(
                        oParamMacroField_ParamStringField_InternalMacroField_InternalStringField_InternalMacrosValueField_DirectiveFields
                                .toString());
            }
        }
        if (this.eContextField.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oContextField : this.eContextField) {
            sb.append(oContextField.toString());
        }
        if (this.eConstructor.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oConstructor : this.eConstructor) {
            sb.append(oConstructor.toString());
        }
        if (this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                .size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter : this.eParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(
                        oParamStringSetter_SingleAdd_InternalStringSetter_InternalMacroSetter
                                .toString());
            }
        }
        if (this.eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
                .size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder : this.eParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(
                        oParamStringRefBuilder_ParamMacroRefBuilder_InternalMacroRefBuilder
                                .toString());
            }
        }
        if (this.eParamStringRef_ParamMacroRef_InternalMacroRef.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamStringRef_ParamMacroRef_InternalMacroRef : this.eParamStringRef_ParamMacroRef_InternalMacroRef) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamStringRef_ParamMacroRef_InternalMacroRef
                        .toString());
            }
        }
        {
            boolean first = true;
            for (Object oInitInternalsMethod : this.eInitInternalsMethod) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oInitInternalsMethod.toString());
            }
        }
        if (this.eInitDirectives.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oInitDirectives : this.eInitDirectives) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oInitDirectives.toString());
            }
        }
        for (Object oRedefinedApplyInitializer : this.eRedefinedApplyInitializer) {
            sb.append(oRedefinedApplyInitializer.toString());
        }
        if (this.eMacroBuilder.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oMacroBuilder : this.eMacroBuilder) {
            sb.append(oMacroBuilder.toString());
        }
        if (this.eEmptyBuilderWithContext.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oEmptyBuilderWithContext : this.eEmptyBuilderWithContext) {
            sb.append(oEmptyBuilderWithContext.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("    private String applyIndent(");
        sb.append(System.getProperty("line.separator"));
        sb.append("                        String macro,");
        sb.append(System.getProperty("line.separator"));
        sb.append("                        String indent){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        StringBuilder sb = new StringBuilder();");
        sb.append(System.getProperty("line.separator"));
        sb.append("        String[] lines = macro.split( \"\\n\");");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        if(lines.length > 1){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            for(int i = 0; i < lines.length; i++){");
        sb.append(System.getProperty("line.separator"));
        sb.append("                String line = lines[i];");
        sb.append(System.getProperty("line.separator"));
        sb.append("                sb.append(indent).append(line);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("                if(i < lines.length - 1){");
        sb.append(System.getProperty("line.separator"));
        sb.append("                    sb.append(LINE_SEPARATOR);");
        sb.append(System.getProperty("line.separator"));
        sb.append("                }");
        sb.append(System.getProperty("line.separator"));
        sb.append("            }");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append("        else{");
        sb.append(System.getProperty("line.separator"));
        sb.append("            sb.append(indent).append(macro);");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        return sb.toString();");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
