/*
 * Encog(tm) Core v3.4 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core
 
 * Copyright 2008-2016 Heaton Research, Inc.
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
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.ml.prg;

import org.junit.Assert;
import org.junit.Test;

public class TestEncogProgram {

	@Test
	public void testSize() {
		EncogProgram expression = new EncogProgram("1");
		Assert.assertEquals(1, expression.getRootNode().size());
		
		expression = new EncogProgram("1+1");
		Assert.assertEquals(3, expression.getRootNode().size());
		
		expression = new EncogProgram("1+1+1");
		Assert.assertEquals(5, expression.getRootNode().size());
		
		expression = new EncogProgram("(sin(x)+cos(x))/2");
		Assert.assertEquals(7, expression.getRootNode().size());
	}
}
