/*
 * Copyright (c) 2015. Zuercher Hochschule fuer Angewandte Wissenschaften
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */
package ch.icclab.cyclops.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Martin Skoviera
 * Created on: 15-Oct-15
 * Description: POJO object for Network Offering Usage Data (type 13)
 */
public class NetworkOffering extends UsageData {

    private boolean isdefault;

    private String virtualmachineid;

    /////////////////////////////
    // Getters and Setters

    public boolean isdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    public String getVirtualmachineid() {
        return virtualmachineid;
    }

    public void setVirtualmachineid(String virtualmachineid) {
        this.virtualmachineid = virtualmachineid;
    }

    @Override
    protected void additionalMetadata(Map map) {
        if (virtualmachineid != null) {
            map.put("virtualmachineId", virtualmachineid);
        }
    }
}
