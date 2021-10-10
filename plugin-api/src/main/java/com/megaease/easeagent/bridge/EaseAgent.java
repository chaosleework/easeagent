package com.megaease.easeagent.bridge;

import com.megaease.easeagent.api.logging.ILoggerFactory;
import com.megaease.easeagent.api.logging.Logger;
import com.megaease.easeagent.config.Config;
import com.megaease.easeagent.config.IConfigFactory;

/**
 * the bridge api will be initiated when agent startup
 */
public final class EaseAgent {
    public static volatile ILoggerFactory loggerFactory = new NoOpLoggerFactory();
    public static volatile IConfigFactory configFactory = new NoOpConfigFactory();

    /*
     * api interface add here
     */
}
