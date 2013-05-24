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

package org.sablecc.sablecc.semantics;

import org.sablecc.sablecc.syntax3.node.*;

public class SemanticVerifier {

    private Start ast;

    private SemanticVerifier(
            Start ast) {

        this.ast = ast;
    }

    // TODO: change return type and return structure
    public static void verify(
            Start ast) {

        SemanticVerifier verifier = new SemanticVerifier(ast);

        verifier.collectDeclarations();

        // TODO: implement
    }

    private void collectDeclarations() {

        // TODO Auto-generated method stub

    }
}