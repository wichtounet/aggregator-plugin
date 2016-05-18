package org.ihateruby.aggregator;

import org.sonar.api.web.*;

import static org.sonar.api.web.WidgetScope.GLOBAL;

@WidgetCategory({"Filters"})
@WidgetScope(GLOBAL)
@WidgetProperties({
  @WidgetProperty(key = AggregatorListWidget.FILTER_PROPERTY, type = WidgetPropertyType.FILTER, optional = false)
})
public class AggregatorListWidget extends AbstractRubyTemplate implements RubyRailsWidget {
  public static final String FILTER_PROPERTY = "filter";

  @Override
  public String getId() {
    return "aggregator_list_widget_global";
  }

  @Override
  public String getTitle() {
    return "Global Metrics (Filter)";
  }

  @Override
  protected String getTemplatePath() {
    return "/aggregator_list_widget_global.html.erb";
  }
}
