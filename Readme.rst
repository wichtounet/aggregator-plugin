aggregator-plugin
+++++++++++++++++

.. image:: https://raw.githubusercontent.com/wichtounet/aggregator-plugin/master/widget.png
  :align: center

Simple Sonar plugin to display aggregated stats for all projects.

The metrics are aggregated from the API via AJAX, therefore you
could experience a very slight delay in displaying the values.

Installation
------------

To install the plugin, simply copy the file aggregator-plugin.jar
(downloaded from the Releases page) and copy it to your
sonar/extensions/plugins directory.

Build from sources
------------------

To install the plugin, you need maven to build it:

.. code:: bash
   mvn clean package

Then, you need to copy the target/aggregator-plugin-0.1.jar file into
your sonar/extensions/plugins directory.
