/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessages;

public class MInvalidLongOption {

    private final String pOptionName;

    private final MInvalidLongOption mInvalidLongOption = this;

    public MInvalidLongOption(
            String pOptionName) {

        if (pOptionName == null) {
            throw new NullPointerException();
        }
        this.pOptionName = pOptionName;
    }

    String pOptionName() {

        return this.pOptionName;
    }

    private String rOptionName() {

        return this.mInvalidLongOption.pOptionName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MCommandLineErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("The following option is rejected:");
        sb.append(System.getProperty("line.separator"));
        sb.append(" --");
        sb.append(rOptionName());
        sb.append(System.getProperty("line.separator"));
        sb.append("It is not a valid option.");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(new MCommandLineErrorTail().toString());
        return sb.toString();
    }

}
