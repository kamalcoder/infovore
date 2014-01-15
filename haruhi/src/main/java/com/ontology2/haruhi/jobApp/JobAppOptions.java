package com.ontology2.haruhi.jobApp;

import com.ontology2.centipede.parser.HasOptions;
import com.ontology2.centipede.parser.Option;
import com.ontology2.centipede.parser.Positional;
import com.ontology2.centipede.parser.Required;

public class JobAppOptions implements HasOptions {
    @Required
    @Option(description="Java Bean Name for cluster driver",defaultValue="")
    public String clusterId;

    @Required
    @Option(description="Java Bean Name for JAR coordinates",defaultValue="")
    public String jarId;

    @Option(description="Identifier for running cluster")
    public String runningCluster;

    @Positional
    public String[] remainingArguments;
}