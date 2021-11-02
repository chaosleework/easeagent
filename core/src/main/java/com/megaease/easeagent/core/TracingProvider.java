package com.megaease.easeagent.core;

import com.megaease.easeagent.plugin.api.Context;
import com.megaease.easeagent.plugin.api.InitializeContext;
import com.megaease.easeagent.plugin.api.trace.Tracing;

import java.util.function.Function;
import java.util.function.Supplier;

public interface TracingProvider {
    Function<Supplier<InitializeContext>, Tracing> tracingSupplier();

    void setRootSpanFinishCall(Function rootSpanFinish);
}
