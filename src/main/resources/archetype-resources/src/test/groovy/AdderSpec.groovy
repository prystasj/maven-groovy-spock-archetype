#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

/*
* Copyright 2012 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import spock.lang.Specification
import spock.lang.Unroll

class AdderSpec extends Specification {

    Adder adder = new Adder()

    @Unroll("${symbol_pound}i + ${symbol_pound}j == ${symbol_pound}sum?")
    def 'can add two numbers together to produce a sum'() {
        expect:
            sum == adder.add(i, j)
        where:
            i | j | sum
            1 | 2 | 3
            2 | 2 | 4
           -1 | 1 | 0
    }

}

