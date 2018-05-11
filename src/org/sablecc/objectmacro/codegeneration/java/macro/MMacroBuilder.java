/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MMacroBuilder
        extends Macro {

    private String field_MacroName;

    private final List<Macro> list_ContextParam;

    private DSeparator ContextParamSeparator;

    private DBeforeFirst ContextParamBeforeFirst;

    private DAfterLast ContextParamAfterLast;

    private DNone ContextParamNone;

    private final InternalValue ContextParamValue;

    private final List<Macro> list_ContextBuildState;

    private DSeparator ContextBuildStateSeparator;

    private DBeforeFirst ContextBuildStateBeforeFirst;

    private DAfterLast ContextBuildStateAfterLast;

    private DNone ContextBuildStateNone;

    private final InternalValue ContextBuildStateValue;

    private final List<Macro> list_NewBuildState;

    private DSeparator NewBuildStateSeparator;

    private DBeforeFirst NewBuildStateBeforeFirst;

    private DAfterLast NewBuildStateAfterLast;

    private DNone NewBuildStateNone;

    private final InternalValue NewBuildStateValue;

    private final List<Macro> list_DirectivesCalls;

    private DSeparator DirectivesCallsSeparator;

    private DBeforeFirst DirectivesCallsBeforeFirst;

    private DAfterLast DirectivesCallsAfterLast;

    private DNone DirectivesCallsNone;

    private final InternalValue DirectivesCallsValue;

    private final List<Macro> list_InternalsCalls;

    private DSeparator InternalsCallsSeparator;

    private DBeforeFirst InternalsCallsBeforeFirst;

    private DAfterLast InternalsCallsAfterLast;

    private DNone InternalsCallsNone;

    private final InternalValue InternalsCallsValue;

    private final List<Macro> list_MacroBodyParts;

    private DSeparator MacroBodyPartsSeparator;

    private DBeforeFirst MacroBodyPartsBeforeFirst;

    private DAfterLast MacroBodyPartsAfterLast;

    private DNone MacroBodyPartsNone;

    private final InternalValue MacroBodyPartsValue;

    private final Context ContextParamContext = new Context();

    private final Context ContextBuildStateContext = new Context();

    private final Context NewBuildStateContext = new Context();

    private final Context DirectivesCallsContext = new Context();

    private final Context InternalsCallsContext = new Context();

    private final Context MacroBodyPartsContext = new Context();

    public MMacroBuilder(
            String pMacroName) {

        setPMacroName(pMacroName);

        this.list_ContextParam = new ArrayList<>();

        this.list_ContextBuildState = new ArrayList<>();

        this.list_NewBuildState = new ArrayList<>();

        this.list_DirectivesCalls = new ArrayList<>();

        this.list_InternalsCalls = new ArrayList<>();

        this.list_MacroBodyParts = new ArrayList<>();

        this.ContextParamValue = new InternalValue(this.list_ContextParam,
                this.ContextParamContext);

        this.ContextBuildStateValue = new InternalValue(
                this.list_ContextBuildState, this.ContextBuildStateContext);

        this.NewBuildStateValue = new InternalValue(this.list_NewBuildState,
                this.NewBuildStateContext);

        this.DirectivesCallsValue = new InternalValue(this.list_DirectivesCalls,
                this.DirectivesCallsContext);

        this.InternalsCallsValue = new InternalValue(this.list_InternalsCalls,
                this.InternalsCallsContext);

        this.MacroBodyPartsValue = new InternalValue(this.list_MacroBodyParts,
                this.MacroBodyPartsContext);

    }

    private void setPMacroName(
            String pMacroName) {

        if (pMacroName == null) {

            throw ObjectMacroException.parameterNull("MacroName");

        }

        this.field_MacroName = pMacroName;

    }

    public void addContextParam(
            MContextParam macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("ContextParam");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("ContextParam");

        }

        this.list_ContextParam.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addContextBuildState(
            MContextBuildState macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("ContextBuildState");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("ContextBuildState");

        }

        this.list_ContextBuildState.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addNewBuildState(
            MNewBuildState macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("NewBuildState");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("NewBuildState");

        }

        this.list_NewBuildState.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addDirectivesCalls(
            MInitDirectiveCall macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("DirectivesCalls");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("InitDirectiveCall");

        }

        this.list_DirectivesCalls.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addInternalsCalls(
            MInitInternalsCall macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("InternalsCalls");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("InitInternalsCall");

        }

        this.list_InternalsCalls.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MInitStringBuilder macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("InitStringBuilder");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MStringPart macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("StringPart");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MParamInsertPart macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("ParamInsertPart");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MEolPart macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("EolPart");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MInsertMacroPart macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("InsertMacroPart");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MAddIndent macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("AddIndent");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    public void addMacroBodyParts(
            MIndentPart macro) {

        if (macro == null) {

            throw ObjectMacroException.parameterNull("MacroBodyParts");

        }

        if (this.build_state != null) {

            throw ObjectMacroException.cannotModify("IndentPart");

        }

        this.list_MacroBodyParts.add(macro);

        this.children.add(macro);

        Macro.cycleDetector.detectCycle(this, macro);

    }

    private String buildMacroName() {

        return this.field_MacroName;

    }

    private String buildContextParam() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.ContextParamContext;

        List<Macro> macros = this.list_ContextParam;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.ContextParamNone != null) {

            sb.append(this.ContextParamNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.ContextParamBeforeFirst != null) {

                expansion = this.ContextParamBeforeFirst.apply(i, expansion,
                        nb_macros);

            }

            if (this.ContextParamAfterLast != null) {

                expansion = this.ContextParamAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.ContextParamSeparator != null) {

                expansion = this.ContextParamSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String buildContextBuildState() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.ContextBuildStateContext;

        List<Macro> macros = this.list_ContextBuildState;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.ContextBuildStateNone != null) {

            sb.append(this.ContextBuildStateNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.ContextBuildStateBeforeFirst != null) {

                expansion = this.ContextBuildStateBeforeFirst.apply(i,
                        expansion, nb_macros);

            }

            if (this.ContextBuildStateAfterLast != null) {

                expansion = this.ContextBuildStateAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.ContextBuildStateSeparator != null) {

                expansion = this.ContextBuildStateSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String buildNewBuildState() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.NewBuildStateContext;

        List<Macro> macros = this.list_NewBuildState;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.NewBuildStateNone != null) {

            sb.append(this.NewBuildStateNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.NewBuildStateBeforeFirst != null) {

                expansion = this.NewBuildStateBeforeFirst.apply(i, expansion,
                        nb_macros);

            }

            if (this.NewBuildStateAfterLast != null) {

                expansion = this.NewBuildStateAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.NewBuildStateSeparator != null) {

                expansion = this.NewBuildStateSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String buildDirectivesCalls() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.DirectivesCallsContext;

        List<Macro> macros = this.list_DirectivesCalls;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.DirectivesCallsNone != null) {

            sb.append(this.DirectivesCallsNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.DirectivesCallsBeforeFirst != null) {

                expansion = this.DirectivesCallsBeforeFirst.apply(i, expansion,
                        nb_macros);

            }

            if (this.DirectivesCallsAfterLast != null) {

                expansion = this.DirectivesCallsAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.DirectivesCallsSeparator != null) {

                expansion = this.DirectivesCallsSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String buildInternalsCalls() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.InternalsCallsContext;

        List<Macro> macros = this.list_InternalsCalls;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.InternalsCallsNone != null) {

            sb.append(this.InternalsCallsNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.InternalsCallsBeforeFirst != null) {

                expansion = this.InternalsCallsBeforeFirst.apply(i, expansion,
                        nb_macros);

            }

            if (this.InternalsCallsAfterLast != null) {

                expansion = this.InternalsCallsAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.InternalsCallsSeparator != null) {

                expansion = this.InternalsCallsSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String buildMacroBodyParts() {

        StringBuilder sb = new StringBuilder();

        Context local_context = this.MacroBodyPartsContext;

        List<Macro> macros = this.list_MacroBodyParts;

        int i = 0;

        int nb_macros = macros.size();

        String expansion = null;

        if (this.MacroBodyPartsNone != null) {

            sb.append(this.MacroBodyPartsNone.apply(i, "", nb_macros));

        }

        for (Macro macro : macros) {

            expansion = macro.build(local_context);

            if (this.MacroBodyPartsBeforeFirst != null) {

                expansion = this.MacroBodyPartsBeforeFirst.apply(i, expansion,
                        nb_macros);

            }

            if (this.MacroBodyPartsAfterLast != null) {

                expansion = this.MacroBodyPartsAfterLast.apply(i, expansion,
                        nb_macros);

            }

            if (this.MacroBodyPartsSeparator != null) {

                expansion = this.MacroBodyPartsSeparator.apply(i, expansion,
                        nb_macros);

            }

            sb.append(expansion);

            i++;

        }

        return sb.toString();

    }

    private String getMacroName() {

        return this.field_MacroName;

    }

    private InternalValue getContextParam() {

        return this.ContextParamValue;

    }

    private InternalValue getContextBuildState() {

        return this.ContextBuildStateValue;

    }

    private InternalValue getNewBuildState() {

        return this.NewBuildStateValue;

    }

    private InternalValue getDirectivesCalls() {

        return this.DirectivesCallsValue;

    }

    private InternalValue getInternalsCalls() {

        return this.InternalsCallsValue;

    }

    private InternalValue getMacroBodyParts() {

        return this.MacroBodyPartsValue;

    }

    private void initContextParamInternals(
            Context context) {

        for (Macro macro : this.list_ContextParam) {

            macro.apply(new InternalsInitializer("ContextParam") {

                @Override

                void setContextParam(
                        MContextParam mContextParam) {

                }

            });

        }

    }

    private void initContextBuildStateInternals(
            Context context) {

        for (Macro macro : this.list_ContextBuildState) {

            macro.apply(new InternalsInitializer("ContextBuildState") {

                @Override

                void setContextBuildState(
                        MContextBuildState mContextBuildState) {

                }

            });

        }

    }

    private void initNewBuildStateInternals(
            Context context) {

        for (Macro macro : this.list_NewBuildState) {

            macro.apply(new InternalsInitializer("NewBuildState") {

                @Override

                void setNewBuildState(
                        MNewBuildState mNewBuildState) {

                }

            });

        }

    }

    private void initDirectivesCallsInternals(
            Context context) {

        for (Macro macro : this.list_DirectivesCalls) {

            macro.apply(new InternalsInitializer("DirectivesCalls") {

                @Override

                void setInitDirectiveCall(
                        MInitDirectiveCall mInitDirectiveCall) {

                }

            });

        }

    }

    private void initInternalsCallsInternals(
            Context context) {

        for (Macro macro : this.list_InternalsCalls) {

            macro.apply(new InternalsInitializer("InternalsCalls") {

                @Override

                void setInitInternalsCall(
                        MInitInternalsCall mInitInternalsCall) {

                }

            });

        }

    }

    private void initMacroBodyPartsInternals(
            Context context) {

        for (Macro macro : this.list_MacroBodyParts) {

            macro.apply(new InternalsInitializer("MacroBodyParts") {

                @Override

                void setInitStringBuilder(
                        MInitStringBuilder mInitStringBuilder) {

                }

                @Override

                void setStringPart(
                        MStringPart mStringPart) {

                }

                @Override

                void setParamInsertPart(
                        MParamInsertPart mParamInsertPart) {

                }

                @Override

                void setEolPart(
                        MEolPart mEolPart) {

                }

                @Override

                void setInsertMacroPart(
                        MInsertMacroPart mInsertMacroPart) {

                }

                @Override

                void setAddIndent(
                        MAddIndent mAddIndent) {

                }

                @Override

                void setIndentPart(
                        MIndentPart mIndentPart) {

                }

            });

        }

    }

    private void initContextParamDirectives() {

    }

    private void initContextBuildStateDirectives() {

        StringBuilder sb0 = new StringBuilder();

        sb0.append("this.build_state");

        this.ContextBuildStateNone = new DNone(sb0.toString());

        this.ContextBuildStateValue.setNone(this.ContextBuildStateNone);

    }

    private void initNewBuildStateDirectives() {

        StringBuilder sb0 = new StringBuilder();

        sb0.append("this.build_state = buildState");

        this.NewBuildStateNone = new DNone(sb0.toString());

        this.NewBuildStateValue.setNone(this.NewBuildStateNone);

    }

    private void initDirectivesCallsDirectives() {

        StringBuilder sb0 = new StringBuilder();

        sb0.append(Macro.LINE_SEPARATOR);

        this.DirectivesCallsSeparator = new DSeparator(sb0.toString());

        this.DirectivesCallsValue.setSeparator(this.DirectivesCallsSeparator);

    }

    private void initInternalsCallsDirectives() {

        StringBuilder sb0 = new StringBuilder();

        sb0.append(Macro.LINE_SEPARATOR);

        this.InternalsCallsSeparator = new DSeparator(sb0.toString());

        this.InternalsCallsValue.setSeparator(this.InternalsCallsSeparator);

    }

    private void initMacroBodyPartsDirectives() {

        StringBuilder sb0 = new StringBuilder();

        sb0.append(Macro.LINE_SEPARATOR);

        this.MacroBodyPartsSeparator = new DSeparator(sb0.toString());

        this.MacroBodyPartsValue.setSeparator(this.MacroBodyPartsSeparator);

    }

    @Override

    void apply(

            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacroBuilder(this);

    }

    @Override

    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {

            buildState = new BuildState();

        }

        else if (buildState.getExpansion() == null) {

            throw ObjectMacroException.cyclicReference("MacroBuilder");

        }

        else {

            return buildState.getExpansion();

        }

        this.build_state = buildState;

        List<String> indentations = new LinkedList<>();

        StringBuilder sbIndentation = new StringBuilder();

        initContextParamDirectives();

        initContextBuildStateDirectives();

        initNewBuildStateDirectives();

        initDirectivesCallsDirectives();

        initInternalsCallsDirectives();

        initMacroBodyPartsDirectives();

        initContextParamInternals(null);

        initContextBuildStateInternals(null);

        initNewBuildStateInternals(null);

        initDirectivesCallsInternals(null);

        initInternalsCallsInternals(null);

        initMacroBodyPartsInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("@Override");

        sb0.append(Macro.LINE_SEPARATOR);

        MPublic minsert_1 = new MPublic();

        sb0.append(minsert_1.build(null));

        sb0.append(" String build(");

        sb0.append(buildContextParam());

        sb0.append(")");

        sb0.append("{");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    BuildState buildState = ");

        sb0.append(buildContextBuildState());

        sb0.append(";");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    if(buildState == null)");

        sb0.append("{");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("        buildState = new BuildState();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    }");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    else if(buildState.getExpansion() == null)");

        sb0.append("{");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("        throw ObjectMacroException.cyclicReference(\"");

        sb0.append(buildMacroName());

        sb0.append("\");");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    }");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    else");

        sb0.append("{");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("        return buildState.getExpansion();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    }");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    ");

        sb0.append(buildNewBuildState());

        sb0.append(";");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    List<String> indentations = new LinkedList<>();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    StringBuilder sbIndentation = new StringBuilder();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        StringBuilder sb1 = new StringBuilder();

        sbIndentation = new StringBuilder();

        sbIndentation.append("    ");

        indentations.add(sbIndentation.toString());

        sb1.append(buildDirectivesCalls());

        sb1.append(Macro.LINE_SEPARATOR);

        sb1.append(Macro.LINE_SEPARATOR);

        sb1.append(buildInternalsCalls());

        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    StringBuilder sb0 = new StringBuilder();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        StringBuilder sb2 = new StringBuilder();

        sbIndentation = new StringBuilder();

        sbIndentation.append("    ");

        indentations.add(sbIndentation.toString());

        sb2.append(buildMacroBodyParts());

        sb0.append(applyIndent(sb2.toString(),
                indentations.remove(indentations.size() - 1)));

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    buildState.setExpansion(sb0.toString());");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("    return sb0.toString();");

        sb0.append(Macro.LINE_SEPARATOR);

        sb0.append("}");

        buildState.setExpansion(sb0.toString());

        return sb0.toString();

    }

    @Override

    String build(
            Context context) {

        return build();

    }

    private String applyIndent(
            String macro,
            String indent) {

        StringBuilder sb = new StringBuilder();
        String[] lines = macro.split("\n");

        if (lines.length > 1) {
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                sb.append(indent).append(line);

                if (i < lines.length - 1) {
                    sb.append(Macro.LINE_SEPARATOR);
                }
            }
        }
        else {
            sb.append(indent).append(macro);
        }

        return sb.toString();
    }
}