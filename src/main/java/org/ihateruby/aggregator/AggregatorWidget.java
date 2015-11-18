package org.ihateruby.aggregator;

import org.sonar.api.web.*;

@WidgetScope("GLOBAL")
public class AggregatorWidget extends AbstractRubyTemplate implements RubyRailsWidget {
  @Override
  public String getId() {
    return "aggregator_widget_global";
  }

  @Override
  public String getTitle() {
    return "Aggregator";
  }

  @Override
  protected String getTemplatePath() {
    return "/aggregator_widget_global.html.erb";
  }
}
