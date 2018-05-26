/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MVersions
        extends Macro {

    final List<Macro> list_Versions;

    final Context VersionsContext = new Context();

    final InternalValue VersionsValue;

    private DSeparator VersionsSeparator;

    private DBeforeFirst VersionsBeforeFirst;

    private DAfterLast VersionsAfterLast;

    private DNone VersionsNone;

    public MVersions(
            Macros macros) {

        setMacros(macros);
        this.list_Versions = new LinkedList<>();

        this.VersionsValue
                = new InternalValue(this.list_Versions, this.VersionsContext);
    }

    public void addAllVersions(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("Versions");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Versions");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeVersions(macro);
            this.list_Versions.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeVersions(
            Macro macro) {

        macro.apply(new InternalsInitializer("Versions") {

            @Override
            void setSimpleName(
                    MSimpleName mSimpleName) {

            }
        });
    }

    public void addVersions(
            MSimpleName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Versions");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("Versions");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Versions.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildVersions() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.VersionsContext;
        List<Macro> macros = this.list_Versions;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.VersionsNone != null) {
            sb.append(this.VersionsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.VersionsBeforeFirst != null) {
                expansion = this.VersionsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.VersionsAfterLast != null) {
                expansion
                        = this.VersionsAfterLast.apply(i, expansion, nb_macros);
            }

            if (this.VersionsSeparator != null) {
                expansion
                        = this.VersionsSeparator.apply(i, expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private InternalValue getVersions() {

        return this.VersionsValue;
    }

    private void initVersionsInternals(
            Context context) {

        for (Macro macro : this.list_Versions) {
            macro.apply(new InternalsInitializer("Versions") {

                @Override
                void setSimpleName(
                        MSimpleName mSimpleName) {

                }
            });
        }
    }

    private void initVersionsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(", ");
        sb1.append(LINE_SEPARATOR);
        this.VersionsSeparator = new DSeparator(sb1.toString());
        this.VersionsValue.setSeparator(this.VersionsSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setVersions(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException.cyclicReference("Versions");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        initVersionsDirectives();

        initVersionsInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("Version ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildVersions());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

        buildState.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}