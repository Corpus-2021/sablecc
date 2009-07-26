/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.structure;

import org.sablecc.exception.InternalException;
import org.sablecc.sablecc.syntax3.node.ANormalParserProduction;
import org.sablecc.sablecc.syntax3.node.AParserContext;
import org.sablecc.sablecc.syntax3.node.ASelectionParserProduction;
import org.sablecc.sablecc.syntax3.node.TIdentifier;

public class ParserContext {

    private final GlobalIndex globalIndex;

    private final AParserContext declaration;

    ParserContext(
            GlobalIndex globalIndex,
            AParserContext declaration) {

        if (declaration == null) {
            throw new InternalException("declaration may not be null");
        }

        this.globalIndex = globalIndex;
        this.declaration = declaration;
    }

    public ParserNormalProduction addParserProduction(
            ANormalParserProduction declaration) {

        return this.globalIndex.addParserProduction(declaration, this);
    }

    public ParserSelector addParserSelector(
            ASelectionParserProduction declaration) {

        return this.globalIndex.addParserSelector(declaration);
    }

    public TIdentifier getNameDeclaration() {

        return this.declaration.getName();
    }

    public String getName() {

        return getNameDeclaration().getText();
    }

}