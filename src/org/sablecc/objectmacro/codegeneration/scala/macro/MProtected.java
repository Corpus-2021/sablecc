/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

public class MProtected {

    private final String pPackage;

    private final MProtected mProtected = this;

    public MProtected(
            String pPackage) {

        if (pPackage == null) {
            throw new NullPointerException();
        }
        this.pPackage = pPackage;
    }

    String pPackage() {

        return this.pPackage;
    }

    private String rPackage() {

        return this.mProtected.pPackage();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("protected[");
        sb.append(rPackage());
        sb.append("]");
        return sb.toString();
    }

}
