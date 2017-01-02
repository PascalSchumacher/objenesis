/**
 * Copyright 2006-2017 the original author or authors.
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
package org.objenesis.tck.search;

/**
 * @author Henri Tremblay
 */
public class SystemOutListener implements SearchWorkingInstantiatorListener {

    private static final String PATTERN = "%-50s: %s%n";

    public void instantiatorSupported(Class<?> c) {
        System.out.printf(PATTERN, c.getSimpleName(), "Working!");
    }

    public void instantiatorUnsupported(Class<?> c, Throwable t) {
        System.out.printf(PATTERN, c.getSimpleName(), "KO - " + t);
    }
}
