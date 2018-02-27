/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MClassInternalValue {

    private final List<Object> ePackageDeclaration = new LinkedList<>();

    private final List<Object> eImportJavaUtil = new LinkedList<>();

    public MClassInternalValue() {

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
        sb.append("class InternalValue {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private final List<Macro> macros;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private DAfterLast dAfterLast;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private DBeforeFirst dBeforeFirst;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private DSeparator dSeparator;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private DNone dNone;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private final Context context;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    private String cache;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    InternalValue(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            List<Macro> macros,");
        sb.append(System.getProperty("line.separator"));
        sb.append("            Context context){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.macros = macros;");
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.context = context;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    String build(){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        if(this.cache != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            return this.cache;");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        StringBuilder sb = new StringBuilder();");
        sb.append(System.getProperty("line.separator"));
        sb.append("        int i = 0;");
        sb.append(System.getProperty("line.separator"));
        sb.append("        int nb_macros = this.macros.size();");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        if(this.dNone != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append(
                "            sb.append(this.dNone.apply(i, \"\", nb_macros));");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        for(Macro macro : this.macros){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            String expansion = macro.build(this.context);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("            if(this.dBeforeFirst != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append(
                "                expansion = dBeforeFirst.apply(i, expansion, nb_macros);");
        sb.append(System.getProperty("line.separator"));
        sb.append("            }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("            if(dAfterLast != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append(
                "                expansion = dAfterLast.apply(i, expansion, nb_macros);");
        sb.append(System.getProperty("line.separator"));
        sb.append("            }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("            if(this.dSeparator != null){");
        sb.append(System.getProperty("line.separator"));
        sb.append(
                "                expansion = dSeparator.apply(i, expansion, nb_macros);");
        sb.append(System.getProperty("line.separator"));
        sb.append("            }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("            sb.append(expansion);");
        sb.append(System.getProperty("line.separator"));
        sb.append("            i++;");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.cache = sb.toString();");
        sb.append(System.getProperty("line.separator"));
        sb.append("        return this.cache;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    void setNone(");
        sb.append(System.getProperty("line.separator"));
        sb.append("                DNone none){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.dNone = none;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    void setBeforeFirst(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            DBeforeFirst dBeforeFirst){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.dBeforeFirst = dBeforeFirst;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    void setAfterLast(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            DAfterLast dAfterLast){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.dAfterLast = dAfterLast;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    void setSeparator(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            DSeparator dSeparator){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.dSeparator = dSeparator;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
