//=======================================================================
// Copyright Baptiste Wicht 2015.
// Distributed under the MIT License.
// (See accompanying file LICENSE or copy at
//  http://opensource.org/licenses/MIT)
//=======================================================================

package org.ihateruby.aggregator;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.SonarPlugin;

public class AggregatorPlugin extends SonarPlugin {
    @Override
    public List getExtensions() {
        return Arrays.asList(AggregatorWidget.class, AggregatorListWidget.class);
    }
}
