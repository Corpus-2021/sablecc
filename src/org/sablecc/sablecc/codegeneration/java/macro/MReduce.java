/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MReduce {

    private final String pReducedProduction;

    private final MReduce mReduce = this;

    private final List<Object> eReduceNormalPop_ReduceEndPop = new LinkedList<Object>();

    private final List<Object> eReduceDecision = new LinkedList<Object>();

    private final List<Object> eNormalParameter = new LinkedList<Object>();

    private final List<Object> eSeparatedParameter = new LinkedList<Object>();

    private final List<Object> eAlternatedParameter = new LinkedList<Object>();

    private final List<Object> eNewParameter = new LinkedList<Object>();

    private final List<Object> eNullParameter = new LinkedList<Object>();

    private final List<Object> eEndParameter = new LinkedList<Object>();

    private final List<Object> eStringParameter = new LinkedList<Object>();

    private final List<Object> eAddPopElement = new LinkedList<Object>();

    private final List<Object> eAddPopElementLeft = new LinkedList<Object>();

    private final List<Object> eAddPopElementRight = new LinkedList<Object>();

    private final List<Object> eAddNewElement = new LinkedList<Object>();

    private final List<Object> eAddPopList = new LinkedList<Object>();

    private final List<Object> eAddPopSeparatedList = new LinkedList<Object>();

    private final List<Object> eAddPopAlternatedList = new LinkedList<Object>();

    private final List<Object> eAddPopReverseSeparatedList = new LinkedList<Object>();

    private final List<Object> eAddPopReverseAlternatedList = new LinkedList<Object>();

    private final List<Object> eGetLeft = new LinkedList<Object>();

    private final List<Object> eGetRight = new LinkedList<Object>();

    private final List<Object> eAddNewList = new LinkedList<Object>();

    private final List<Object> eAcceptDecision = new LinkedList<Object>();

    MReduce(
            String pReducedProduction) {

        if (pReducedProduction == null) {
            throw new NullPointerException();
        }
        this.pReducedProduction = pReducedProduction;
    }

    public MReduceDecision newReduceDecision() {

        MReduceDecision lReduceDecision = new MReduceDecision(this.mReduce);
        this.eReduceDecision.add(lReduceDecision);
        return lReduceDecision;
    }

    public MNormalParameter newNormalParameter(
            String pElementType,
            String pElementName,
            String pIndex) {

        MNormalParameter lNormalParameter = new MNormalParameter(pElementType,
                pElementName, pIndex);
        this.eNormalParameter.add(lNormalParameter);
        return lNormalParameter;
    }

    public MSeparatedParameter newSeparatedParameter(
            String pLeftElementType,
            String pRightElementType,
            String pElementName,
            String pIndex) {

        MSeparatedParameter lSeparatedParameter = new MSeparatedParameter(
                pLeftElementType, pRightElementType, pElementName, pIndex);
        this.eSeparatedParameter.add(lSeparatedParameter);
        return lSeparatedParameter;
    }

    public MAlternatedParameter newAlternatedParameter(
            String pLeftElementType,
            String pRightElementType,
            String pElementName,
            String pIndex) {

        MAlternatedParameter lAlternatedParameter = new MAlternatedParameter(
                pLeftElementType, pRightElementType, pElementName, pIndex);
        this.eAlternatedParameter.add(lAlternatedParameter);
        return lAlternatedParameter;
    }

    public MNewParameter newNewParameter(
            String pElementName) {

        MNewParameter lNewParameter = new MNewParameter(pElementName);
        this.eNewParameter.add(lNewParameter);
        return lNewParameter;
    }

    public MNullParameter newNullParameter() {

        MNullParameter lNullParameter = new MNullParameter();
        this.eNullParameter.add(lNullParameter);
        return lNullParameter;
    }

    public MEndParameter newEndParameter() {

        MEndParameter lEndParameter = new MEndParameter();
        this.eEndParameter.add(lEndParameter);
        return lEndParameter;
    }

    public MStringParameter newStringParameter(
            String pString) {

        MStringParameter lStringParameter = new MStringParameter(pString);
        this.eStringParameter.add(lStringParameter);
        return lStringParameter;
    }

    public MAddPopElement newAddPopElement(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElement lAddPopElement = new MAddPopElement(pListName,
                pElementName, pElementType, pIndex);
        this.eAddPopElement.add(lAddPopElement);
        return lAddPopElement;
    }

    public MAddPopElementLeft newAddPopElementLeft(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElementLeft lAddPopElementLeft = new MAddPopElementLeft(
                pListName, pElementName, pElementType, pIndex);
        this.eAddPopElementLeft.add(lAddPopElementLeft);
        return lAddPopElementLeft;
    }

    public MAddPopElementRight newAddPopElementRight(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElementRight lAddPopElementRight = new MAddPopElementRight(
                pListName, pElementName, pElementType, pIndex);
        this.eAddPopElementRight.add(lAddPopElementRight);
        return lAddPopElementRight;
    }

    public MAddNewElement newAddNewElement(
            String pListName,
            String pElementName) {

        MAddNewElement lAddNewElement = new MAddNewElement(pListName,
                pElementName);
        this.eAddNewElement.add(lAddNewElement);
        return lAddNewElement;
    }

    public MAddPopList newAddPopList(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopList lAddPopList = new MAddPopList(pListName, pElementName,
                pElementType, pIndex);
        this.eAddPopList.add(lAddPopList);
        return lAddPopList;
    }

    public MAddPopSeparatedList newAddPopSeparatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopSeparatedList lAddPopSeparatedList = new MAddPopSeparatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopSeparatedList.add(lAddPopSeparatedList);
        return lAddPopSeparatedList;
    }

    public MAddPopAlternatedList newAddPopAlternatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopAlternatedList lAddPopAlternatedList = new MAddPopAlternatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopAlternatedList.add(lAddPopAlternatedList);
        return lAddPopAlternatedList;
    }

    public MAddPopReverseSeparatedList newAddPopReverseSeparatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopReverseSeparatedList lAddPopReverseSeparatedList = new MAddPopReverseSeparatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopReverseSeparatedList.add(lAddPopReverseSeparatedList);
        return lAddPopReverseSeparatedList;
    }

    public MAddPopReverseAlternatedList newAddPopReverseAlternatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopReverseAlternatedList lAddPopReverseAlternatedList = new MAddPopReverseAlternatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopReverseAlternatedList.add(lAddPopReverseAlternatedList);
        return lAddPopReverseAlternatedList;
    }

    public MGetLeft newGetLeft() {

        MGetLeft lGetLeft = new MGetLeft();
        this.eGetLeft.add(lGetLeft);
        return lGetLeft;
    }

    public MGetRight newGetRight() {

        MGetRight lGetRight = new MGetRight();
        this.eGetRight.add(lGetRight);
        return lGetRight;
    }

    public MAddNewList newAddNewList(
            String pListName,
            String pElementName) {

        MAddNewList lAddNewList = new MAddNewList(pListName, pElementName);
        this.eAddNewList.add(lAddNewList);
        return lAddNewList;
    }

    public MAcceptDecision newAcceptDecision(
            String pElementName) {

        MAcceptDecision lAcceptDecision = new MAcceptDecision(pElementName);
        this.eAcceptDecision.add(lAcceptDecision);
        return lAcceptDecision;
    }

    public MReduceNormalPop newReduceNormalPop(
            String pElementName) {

        MReduceNormalPop lReduceNormalPop = new MReduceNormalPop(pElementName);
        this.eReduceNormalPop_ReduceEndPop.add(lReduceNormalPop);
        return lReduceNormalPop;
    }

    public MReduceEndPop newReduceEndPop() {

        MReduceEndPop lReduceEndPop = new MReduceEndPop();
        this.eReduceNormalPop_ReduceEndPop.add(lReduceEndPop);
        return lReduceEndPop;
    }

    String pReducedProduction() {

        return this.pReducedProduction;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("      ParseStack stack = parser.getStack();");
        sb.append(System.getProperty("line.separator"));
        for (Object oReduceNormalPop_ReduceEndPop : this.eReduceNormalPop_ReduceEndPop) {
            sb.append(oReduceNormalPop_ReduceEndPop.toString());
        }
        for (Object oReduceDecision : this.eReduceDecision) {
            sb.append(oReduceDecision.toString());
        }
        for (Object oNormalParameter : this.eNormalParameter) {
            sb.append(oNormalParameter.toString());
        }
        for (Object oSeparatedParameter : this.eSeparatedParameter) {
            sb.append(oSeparatedParameter.toString());
        }
        for (Object oAlternatedParameter : this.eAlternatedParameter) {
            sb.append(oAlternatedParameter.toString());
        }
        for (Object oNewParameter : this.eNewParameter) {
            sb.append(oNewParameter.toString());
        }
        for (Object oNullParameter : this.eNullParameter) {
            sb.append(oNullParameter.toString());
        }
        for (Object oEndParameter : this.eEndParameter) {
            sb.append(oEndParameter.toString());
        }
        for (Object oStringParameter : this.eStringParameter) {
            sb.append(oStringParameter.toString());
        }
        for (Object oAddPopElement : this.eAddPopElement) {
            sb.append(oAddPopElement.toString());
        }
        for (Object oAddPopElementLeft : this.eAddPopElementLeft) {
            sb.append(oAddPopElementLeft.toString());
        }
        for (Object oAddPopElementRight : this.eAddPopElementRight) {
            sb.append(oAddPopElementRight.toString());
        }
        for (Object oAddNewElement : this.eAddNewElement) {
            sb.append(oAddNewElement.toString());
        }
        for (Object oAddPopList : this.eAddPopList) {
            sb.append(oAddPopList.toString());
        }
        for (Object oAddPopSeparatedList : this.eAddPopSeparatedList) {
            sb.append(oAddPopSeparatedList.toString());
        }
        for (Object oAddPopAlternatedList : this.eAddPopAlternatedList) {
            sb.append(oAddPopAlternatedList.toString());
        }
        for (Object oAddPopReverseSeparatedList : this.eAddPopReverseSeparatedList) {
            sb.append(oAddPopReverseSeparatedList.toString());
        }
        for (Object oAddPopReverseAlternatedList : this.eAddPopReverseAlternatedList) {
            sb.append(oAddPopReverseAlternatedList.toString());
        }
        for (Object oGetLeft : this.eGetLeft) {
            sb.append(oGetLeft.toString());
        }
        for (Object oGetRight : this.eGetRight) {
            sb.append(oGetRight.toString());
        }
        for (Object oAddNewList : this.eAddNewList) {
            sb.append(oAddNewList.toString());
        }
        for (Object oAcceptDecision : this.eAcceptDecision) {
            sb.append(oAcceptDecision.toString());
        }
        return sb.toString();
    }

}
