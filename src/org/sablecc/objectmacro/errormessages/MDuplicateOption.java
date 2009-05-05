/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessages;

public class MDuplicateOption {

    private final String pName;

    private final String pLine;

    private final String pChar;

    private final String pRefLine;

    private final String pRefChar;

    private final MDuplicateOption mDuplicateOption = this;

    public MDuplicateOption(
            String pName,
            String pLine,
            String pChar,
            String pRefLine,
            String pRefChar) {

        this.pName = pName;
        this.pLine = pLine;
        this.pChar = pChar;
        this.pRefLine = pRefLine;
        this.pRefChar = pRefChar;
    }

    String pName() {

        return this.pName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pRefLine() {

        return this.pRefLine;
    }

    String pRefChar() {

        return this.pRefChar;
    }

    private String rLine() {

        return this.mDuplicateOption.pLine();
    }

    private String rChar() {

        return this.mDuplicateOption.pChar();
    }

    private String rName() {

        return this.mDuplicateOption.pName();
    }

    private String rRefLine() {

        return this.mDuplicateOption.pRefLine();
    }

    private String rRefChar() {

        return this.mDuplicateOption.pRefChar();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("Duplicate \"");
        sb.append(rName());
        sb.append("\" option.");
        sb.append(System.getProperty("line.separator"));
        sb.append("It was already provided at line ");
        sb.append(rRefLine());
        sb.append(", char ");
        sb.append(rRefChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}