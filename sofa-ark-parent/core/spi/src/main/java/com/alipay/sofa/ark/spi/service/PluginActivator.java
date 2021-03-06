/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.spi.service;

import com.alipay.sofa.ark.exception.ArkRuntimeException;
import com.alipay.sofa.ark.spi.model.PluginContext;

/**
 * Plugin Activator which defines Plugin Entry
 *
 * @author qilong.zql
 * @since 0.1.0
 */
public interface PluginActivator {

    /**
     * Start Plugin
     * @param context plugin context
     * @throws ArkRuntimeException
     */
    void start(PluginContext context);

    /**
     * Stop Plugin
     * @param context
     * @throws ArkRuntimeException
     */
    void stop(PluginContext context);

}