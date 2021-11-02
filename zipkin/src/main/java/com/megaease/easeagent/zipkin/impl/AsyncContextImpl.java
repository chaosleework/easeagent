package com.megaease.easeagent.zipkin.impl;

import com.megaease.easeagent.plugin.api.Context;
import com.megaease.easeagent.plugin.api.InitializeContext;
import com.megaease.easeagent.plugin.api.context.AsyncContext;
import com.megaease.easeagent.plugin.api.trace.Span;
import com.megaease.easeagent.plugin.api.trace.Tracing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AsyncContextImpl implements AsyncContext {
    private final Tracing tracing;
    private final Span span;
    private final Map<Object, Object> context;
    private final Supplier<InitializeContext> supplier;

    public AsyncContextImpl(Tracing tracing, Span span, Supplier<InitializeContext> supplier) {
        this.tracing = tracing;
        this.span = span;
        this.supplier = supplier;
        this.context = new HashMap<>();
    }

    @Override
    public boolean isNoop() {
        return false;
    }

    @Override
    public Tracing getTracer() {
        return tracing;
    }

    @Override
    public Context getContext() {
        return supplier.get();
    }

    @Override
    public Span importToCurr() {
        return supplier.get().importAsync(this);
    }

    public Span getSpan() {
        return span;
    }

    @Override
    public Map<Object, Object> getAll() {
        return context;
    }

    @Override
    public void putAll(Map<Object, Object> context) {
        context.putAll(context);
    }
}
