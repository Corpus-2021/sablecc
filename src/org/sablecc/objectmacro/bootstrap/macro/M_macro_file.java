/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.bootstrap.macro;

import java.util.LinkedList;
import java.util.List;

public class M_macro_file
        extends Macro {

    private final List<Macro> e_expand1 = new LinkedList<Macro>();

    private final List<Macro> e_expand2 = new LinkedList<Macro>();

    public M_macro_file() {

    }

    public M_package newM_package(
            String p_name) {

        M_package v_package = new M_package(p_name);
        this.e_expand1.add(v_package);
        return v_package;
    }

    public M_macro newM_macro(
            String p_class_name,
            String p_indent) {

        M_macro v_macro = new M_macro(p_class_name, p_indent);
        this.e_expand2.add(v_macro);
        return v_macro;
    }

    public void appendTo(
            StringBuilder sb) {

        sb.append("/* This file was generated by SableCC's ObjectMacro. */");
        sb.append(System.getProperty("line.separator"));
        for (Macro v_Macro : this.e_expand1) {
            v_Macro.appendTo(sb);
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("import java.util.*;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Macro v_Macro : this.e_expand2) {
            v_Macro.appendTo(sb);
        }
    }

    public class M_macro
            extends Macro {

        private final String p_class_name;

        private final String p_indent;

        private final List<M_parameter_declaration> m_parameter_declaration = new LinkedList<M_parameter_declaration>();

        private final List<M_nested_macro_declaration> m_nested_macro_declaration = new LinkedList<M_nested_macro_declaration>();

        private final List<M_expand_declaration> m_expand_declaration = new LinkedList<M_expand_declaration>();

        private final List<M_public_constructor> m_public_constructor = new LinkedList<M_public_constructor>();

        private final List<M_constructor_first_parameter> m_constructor_first_parameter = new LinkedList<M_constructor_first_parameter>();

        private final List<M_constructor_additional_parameter> m_constructor_additional_parameter = new LinkedList<M_constructor_additional_parameter>();

        private final List<M_constructor_initialisation> m_constructor_initialisation = new LinkedList<M_constructor_initialisation>();

        private final List<M_nested_macro> m_nested_macro = new LinkedList<M_nested_macro>();

        private final List<Macro> e_expand3 = new LinkedList<Macro>();

        private final List<Macro> e_expand4 = new LinkedList<Macro>();

        M_macro(
                String p_class_name,
                String p_indent) {

            this.p_class_name = p_class_name;
            this.p_indent = p_indent;
        }

        public M_parameter_declaration newM_parameter_declaration(
                String p_param_name) {

            M_parameter_declaration v_parameter_declaration = new M_parameter_declaration(
                    p_param_name);
            this.m_parameter_declaration.add(v_parameter_declaration);
            return v_parameter_declaration;
        }

        public M_nested_macro_declaration newM_nested_macro_declaration(
                String p_nested_macro_name) {

            M_nested_macro_declaration v_nested_macro_declaration = new M_nested_macro_declaration(
                    p_nested_macro_name);
            this.m_nested_macro_declaration.add(v_nested_macro_declaration);
            return v_nested_macro_declaration;
        }

        public M_expand_declaration newM_expand_declaration(
                String p_expand_name) {

            M_expand_declaration v_expand_declaration = new M_expand_declaration(
                    p_expand_name);
            this.m_expand_declaration.add(v_expand_declaration);
            return v_expand_declaration;
        }

        public M_public_constructor newM_public_constructor() {

            M_public_constructor v_public_constructor = new M_public_constructor();
            this.m_public_constructor.add(v_public_constructor);
            return v_public_constructor;
        }

        public M_constructor_first_parameter newM_constructor_first_parameter(
                String p_param_name) {

            M_constructor_first_parameter v_constructor_first_parameter = new M_constructor_first_parameter(
                    p_param_name);
            this.m_constructor_first_parameter
                    .add(v_constructor_first_parameter);
            return v_constructor_first_parameter;
        }

        public M_constructor_additional_parameter newM_constructor_additional_parameter(
                String p_param_name) {

            M_constructor_additional_parameter v_constructor_additional_parameter = new M_constructor_additional_parameter(
                    p_param_name);
            this.m_constructor_additional_parameter
                    .add(v_constructor_additional_parameter);
            return v_constructor_additional_parameter;
        }

        public M_constructor_initialisation newM_constructor_initialisation(
                String p_param_name) {

            M_constructor_initialisation v_constructor_initialisation = new M_constructor_initialisation(
                    p_param_name);
            this.m_constructor_initialisation.add(v_constructor_initialisation);
            return v_constructor_initialisation;
        }

        public M_nested_macro newM_nested_macro(
                String p_nested_macro_name) {

            M_nested_macro v_nested_macro = new M_nested_macro(
                    p_nested_macro_name);
            this.m_nested_macro.add(v_nested_macro);
            return v_nested_macro;
        }

        public M_var_append newM_var_append(
                String p_var_name) {

            M_var_append v_var_append = new M_var_append(p_var_name);
            this.e_expand3.add(v_var_append);
            return v_var_append;
        }

        public M_text_append newM_text_append(
                String p_text) {

            M_text_append v_text_append = new M_text_append(p_text);
            this.e_expand3.add(v_text_append);
            return v_text_append;
        }

        public M_dquote_append newM_dquote_append() {

            M_dquote_append v_dquote_append = new M_dquote_append();
            this.e_expand3.add(v_dquote_append);
            return v_dquote_append;
        }

        public M_eol_append newM_eol_append() {

            M_eol_append v_eol_append = new M_eol_append();
            this.e_expand3.add(v_eol_append);
            return v_eol_append;
        }

        public M_escape_append newM_escape_append(
                String p_char) {

            M_escape_append v_escape_append = new M_escape_append(p_char);
            this.e_expand3.add(v_escape_append);
            return v_escape_append;
        }

        public M_nested_macro_append newM_nested_macro_append(
                String p_nested_macro_name) {

            M_nested_macro_append v_nested_macro_append = new M_nested_macro_append(
                    p_nested_macro_name);
            this.e_expand3.add(v_nested_macro_append);
            return v_nested_macro_append;
        }

        public M_expand_append newM_expand_append(
                String p_expand_name) {

            M_expand_append v_expand_append = new M_expand_append(p_expand_name);
            this.e_expand3.add(v_expand_append);
            return v_expand_append;
        }

        public M_macro newM_macro(
                String p_class_name,
                String p_indent) {

            M_macro v_macro = new M_macro(p_class_name, p_indent);
            this.e_expand4.add(v_macro);
            return v_macro;
        }

        public void appendTo(
                StringBuilder sb) {

            sb.append(this.p_indent);
            sb.append("public class M_");
            sb.append(this.p_class_name);
            sb.append(" extends Macro {");
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
            for (M_parameter_declaration v_parameter_declaration : this.m_parameter_declaration) {
                v_parameter_declaration.appendTo(sb);
            }
            sb.append(System.getProperty("line.separator"));
            for (M_nested_macro_declaration v_nested_macro_declaration : this.m_nested_macro_declaration) {
                v_nested_macro_declaration.appendTo(sb);
            }
            sb.append(System.getProperty("line.separator"));
            for (M_expand_declaration v_expand_declaration : this.m_expand_declaration) {
                v_expand_declaration.appendTo(sb);
            }
            sb.append(System.getProperty("line.separator"));
            sb.append(this.p_indent);
            sb.append("  ");
            for (M_public_constructor v_public_constructor : this.m_public_constructor) {
                v_public_constructor.appendTo(sb);
            }
            sb.append("M_");
            sb.append(this.p_class_name);
            sb.append("(");
            for (M_constructor_first_parameter v_constructor_first_parameter : this.m_constructor_first_parameter) {
                v_constructor_first_parameter.appendTo(sb);
            }
            for (M_constructor_additional_parameter v_constructor_additional_parameter : this.m_constructor_additional_parameter) {
                v_constructor_additional_parameter.appendTo(sb);
            }
            sb.append(") {");
            sb.append(System.getProperty("line.separator"));
            for (M_constructor_initialisation v_constructor_initialisation : this.m_constructor_initialisation) {
                v_constructor_initialisation.appendTo(sb);
            }
            sb.append(this.p_indent);
            sb.append("  }");
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
            for (M_nested_macro v_nested_macro : this.m_nested_macro) {
                v_nested_macro.appendTo(sb);
            }
            sb.append(System.getProperty("line.separator"));
            sb.append(this.p_indent);
            sb.append("  public void appendTo(StringBuilder sb) {");
            sb.append(System.getProperty("line.separator"));
            for (Macro v_Macro : this.e_expand3) {
                v_Macro.appendTo(sb);
            }
            sb.append(this.p_indent);
            sb.append("  }");
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
            for (Macro v_Macro : this.e_expand4) {
                v_Macro.appendTo(sb);
            }
            sb.append(this.p_indent);
            sb.append("}");
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
        }

        public class M_parameter_declaration
                extends Macro {

            private final String p_param_name;

            M_parameter_declaration(
                    String p_param_name) {

                this.p_param_name = p_param_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("  private final String p_");
                sb.append(this.p_param_name);
                sb.append(";");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_nested_macro_declaration
                extends Macro {

            private final String p_nested_macro_name;

            M_nested_macro_declaration(
                    String p_nested_macro_name) {

                this.p_nested_macro_name = p_nested_macro_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("  private final List<M_");
                sb.append(this.p_nested_macro_name);
                sb.append("> m_");
                sb.append(this.p_nested_macro_name);
                sb.append(" = new LinkedList<M_");
                sb.append(this.p_nested_macro_name);
                sb.append(">();");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_expand_declaration
                extends Macro {

            private final String p_expand_name;

            M_expand_declaration(
                    String p_expand_name) {

                this.p_expand_name = p_expand_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("  private final List<Macro> e_");
                sb.append(this.p_expand_name);
                sb.append(" = new LinkedList<Macro>();");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_public_constructor
                extends Macro {

            M_public_constructor() {

            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append("public ");
            }

        }

        public class M_constructor_first_parameter
                extends Macro {

            private final String p_param_name;

            M_constructor_first_parameter(
                    String p_param_name) {

                this.p_param_name = p_param_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("      String p_");
                sb.append(this.p_param_name);
            }

        }

        public class M_constructor_additional_parameter
                extends Macro {

            private final String p_param_name;

            M_constructor_additional_parameter(
                    String p_param_name) {

                this.p_param_name = p_param_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(",");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("      String p_");
                sb.append(this.p_param_name);
            }

        }

        public class M_constructor_initialisation
                extends Macro {

            private final String p_param_name;

            M_constructor_initialisation(
                    String p_param_name) {

                this.p_param_name = p_param_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    this.p_");
                sb.append(this.p_param_name);
                sb.append(" = p_");
                sb.append(this.p_param_name);
                sb.append(";");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_nested_macro
                extends Macro {

            private final String p_nested_macro_name;

            private final List<M_nested_macro_first_parameter> m_nested_macro_first_parameter = new LinkedList<M_nested_macro_first_parameter>();

            private final List<M_nested_macro_additional_parameter> m_nested_macro_additional_parameter = new LinkedList<M_nested_macro_additional_parameter>();

            private final List<M_new_first_parameter> m_new_first_parameter = new LinkedList<M_new_first_parameter>();

            private final List<M_new_additional_parameter> m_new_additional_parameter = new LinkedList<M_new_additional_parameter>();

            private final List<M_add_to_nested_macro> m_add_to_nested_macro = new LinkedList<M_add_to_nested_macro>();

            private final List<M_add_to_expand> m_add_to_expand = new LinkedList<M_add_to_expand>();

            M_nested_macro(
                    String p_nested_macro_name) {

                this.p_nested_macro_name = p_nested_macro_name;
            }

            public M_nested_macro_first_parameter newM_nested_macro_first_parameter(
                    String p_param_name) {

                M_nested_macro_first_parameter v_nested_macro_first_parameter = new M_nested_macro_first_parameter(
                        p_param_name);
                this.m_nested_macro_first_parameter
                        .add(v_nested_macro_first_parameter);
                return v_nested_macro_first_parameter;
            }

            public M_nested_macro_additional_parameter newM_nested_macro_additional_parameter(
                    String p_param_name) {

                M_nested_macro_additional_parameter v_nested_macro_additional_parameter = new M_nested_macro_additional_parameter(
                        p_param_name);
                this.m_nested_macro_additional_parameter
                        .add(v_nested_macro_additional_parameter);
                return v_nested_macro_additional_parameter;
            }

            public M_new_first_parameter newM_new_first_parameter(
                    String p_param_name) {

                M_new_first_parameter v_new_first_parameter = new M_new_first_parameter(
                        p_param_name);
                this.m_new_first_parameter.add(v_new_first_parameter);
                return v_new_first_parameter;
            }

            public M_new_additional_parameter newM_new_additional_parameter(
                    String p_param_name) {

                M_new_additional_parameter v_new_additional_parameter = new M_new_additional_parameter(
                        p_param_name);
                this.m_new_additional_parameter.add(v_new_additional_parameter);
                return v_new_additional_parameter;
            }

            public M_add_to_nested_macro newM_add_to_nested_macro() {

                M_add_to_nested_macro v_add_to_nested_macro = new M_add_to_nested_macro();
                this.m_add_to_nested_macro.add(v_add_to_nested_macro);
                return v_add_to_nested_macro;
            }

            public M_add_to_expand newM_add_to_expand(
                    String p_expand_name) {

                M_add_to_expand v_add_to_expand = new M_add_to_expand(
                        p_expand_name);
                this.m_add_to_expand.add(v_add_to_expand);
                return v_add_to_expand;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("  public M_");
                sb.append(this.p_nested_macro_name);
                sb.append(" newM_");
                sb.append(this.p_nested_macro_name);
                sb.append("(");
                for (M_nested_macro_first_parameter v_nested_macro_first_parameter : this.m_nested_macro_first_parameter) {
                    v_nested_macro_first_parameter.appendTo(sb);
                }
                for (M_nested_macro_additional_parameter v_nested_macro_additional_parameter : this.m_nested_macro_additional_parameter) {
                    v_nested_macro_additional_parameter.appendTo(sb);
                }
                sb.append(") {");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("    M_");
                sb.append(this.p_nested_macro_name);
                sb.append(" v_");
                sb.append(this.p_nested_macro_name);
                sb.append(" = new M_");
                sb.append(this.p_nested_macro_name);
                sb.append("(");
                for (M_new_first_parameter v_new_first_parameter : this.m_new_first_parameter) {
                    v_new_first_parameter.appendTo(sb);
                }
                for (M_new_additional_parameter v_new_additional_parameter : this.m_new_additional_parameter) {
                    v_new_additional_parameter.appendTo(sb);
                }
                sb.append(");");
                sb.append(System.getProperty("line.separator"));
                for (M_add_to_nested_macro v_add_to_nested_macro : this.m_add_to_nested_macro) {
                    v_add_to_nested_macro.appendTo(sb);
                }
                for (M_add_to_expand v_add_to_expand : this.m_add_to_expand) {
                    v_add_to_expand.appendTo(sb);
                }
                sb.append(M_macro.this.p_indent);
                sb.append("    return v_");
                sb.append(this.p_nested_macro_name);
                sb.append(";");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("  }");
                sb.append(System.getProperty("line.separator"));
            }

            public class M_nested_macro_first_parameter
                    extends Macro {

                private final String p_param_name;

                M_nested_macro_first_parameter(
                        String p_param_name) {

                    this.p_param_name = p_param_name;
                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append(System.getProperty("line.separator"));
                    sb.append(M_macro.this.p_indent);
                    sb.append("      String p_");
                    sb.append(this.p_param_name);
                }

            }

            public class M_nested_macro_additional_parameter
                    extends Macro {

                private final String p_param_name;

                M_nested_macro_additional_parameter(
                        String p_param_name) {

                    this.p_param_name = p_param_name;
                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append(",");
                    sb.append(System.getProperty("line.separator"));
                    sb.append(M_macro.this.p_indent);
                    sb.append("      String p_");
                    sb.append(this.p_param_name);
                }

            }

            public class M_new_first_parameter
                    extends Macro {

                private final String p_param_name;

                M_new_first_parameter(
                        String p_param_name) {

                    this.p_param_name = p_param_name;
                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append("p_");
                    sb.append(this.p_param_name);
                }

            }

            public class M_new_additional_parameter
                    extends Macro {

                private final String p_param_name;

                M_new_additional_parameter(
                        String p_param_name) {

                    this.p_param_name = p_param_name;
                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append(", p_");
                    sb.append(this.p_param_name);
                }

            }

            public class M_add_to_nested_macro
                    extends Macro {

                M_add_to_nested_macro() {

                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append(M_macro.this.p_indent);
                    sb.append("    m_");
                    sb.append(M_nested_macro.this.p_nested_macro_name);
                    sb.append(".add(v_");
                    sb.append(M_nested_macro.this.p_nested_macro_name);
                    sb.append(");");
                    sb.append(System.getProperty("line.separator"));
                }

            }

            public class M_add_to_expand
                    extends Macro {

                private final String p_expand_name;

                M_add_to_expand(
                        String p_expand_name) {

                    this.p_expand_name = p_expand_name;
                }

                public void appendTo(
                        StringBuilder sb) {

                    sb.append(M_macro.this.p_indent);
                    sb.append("    e_");
                    sb.append(this.p_expand_name);
                    sb.append(".add(v_");
                    sb.append(M_nested_macro.this.p_nested_macro_name);
                    sb.append(");");
                    sb.append(System.getProperty("line.separator"));
                }

            }

        }

        public class M_var_append
                extends Macro {

            private final String p_var_name;

            M_var_append(
                    String p_var_name) {

                this.p_var_name = p_var_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    sb.append(p_");
                sb.append(this.p_var_name);
                sb.append(");");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_text_append
                extends Macro {

            private final String p_text;

            M_text_append(
                    String p_text) {

                this.p_text = p_text;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    sb.append(");
                sb.append('"');
                sb.append(this.p_text);
                sb.append('"');
                sb.append(");");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_dquote_append
                extends Macro {

            M_dquote_append() {

            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    sb.append('");
                sb.append('"');
                sb.append("');");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_eol_append
                extends Macro {

            M_eol_append() {

            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    sb.append(System.getProperty(");
                sb.append('"');
                sb.append("line.separator");
                sb.append('"');
                sb.append("));");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_escape_append
                extends Macro {

            private final String p_char;

            M_escape_append(
                    String p_char) {

                this.p_char = p_char;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    sb.append('");
                sb.append(this.p_char);
                sb.append("');");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_nested_macro_append
                extends Macro {

            private final String p_nested_macro_name;

            M_nested_macro_append(
                    String p_nested_macro_name) {

                this.p_nested_macro_name = p_nested_macro_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    for(M_");
                sb.append(this.p_nested_macro_name);
                sb.append(" v_");
                sb.append(this.p_nested_macro_name);
                sb.append(" : m_");
                sb.append(this.p_nested_macro_name);
                sb.append(") {");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("      v_");
                sb.append(this.p_nested_macro_name);
                sb.append(".appendTo(sb);");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("    }");
                sb.append(System.getProperty("line.separator"));
            }

        }

        public class M_expand_append
                extends Macro {

            private final String p_expand_name;

            M_expand_append(
                    String p_expand_name) {

                this.p_expand_name = p_expand_name;
            }

            public void appendTo(
                    StringBuilder sb) {

                sb.append(M_macro.this.p_indent);
                sb.append("    for(Macro v_Macro : e_");
                sb.append(this.p_expand_name);
                sb.append(") {");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("      v_Macro.appendTo(sb);");
                sb.append(System.getProperty("line.separator"));
                sb.append(M_macro.this.p_indent);
                sb.append("    }");
                sb.append(System.getProperty("line.separator"));
            }

        }

    }

}