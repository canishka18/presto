/*
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
package com.facebook.presto.operator.scalar.sql;

import com.facebook.presto.operator.scalar.AbstractTestFunctions;
import com.google.common.collect.ImmutableList;
import org.testng.annotations.Test;

import com.facebook.presto.common.type.ArrayType;
import static com.facebook.presto.common.type.CharType.createCharType;


public class TestToCharArrayFunction
        extends AbstractTestFunctions
{
    @Test
    public void testBasic()
    {
        assertFunction(
                "TO_CHAR_ARRAY('foobar')",
                new ArrayType(createCharType(1)),
                ImmutableList.of("f", "o", "o", "b", "a", "r"));
        assertFunction(
                "TO_CHAR_ARRAY('FIZZ')",
                new ArrayType(createCharType(1)),
                ImmutableList.of("F", "I", "Z", "Z"));
    }

}
