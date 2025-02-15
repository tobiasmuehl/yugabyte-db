// Copyright (c) YugaByte, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.  You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software distributed under the License
// is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
// or implied.  See the License for the specific language governing permissions and limitations
// under the License.
//

package org.yb.pgsql;

import org.junit.runner.RunWith;
import org.yb.util.YBTestRunnerNonTsanOnly;

import java.util.Map;

// This class runs all the tests from TestSecureCluster but all tservers in cluster are started
// with extra argument 'use_node_hostname_for_local_tserver=true'
@RunWith(value=YBTestRunnerNonTsanOnly.class)
public class TestSecureClusterLocalTServerHostName extends TestSecureCluster {

  @Override
  protected Map<String, String> getTServerFlags() {
    Map<String, String> flagMap = super.getMasterAndTServerFlags();
    flagMap.put("use_node_hostname_for_local_tserver", "true");
    return flagMap;
  }
}
