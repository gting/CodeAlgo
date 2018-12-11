package test;

import com.datastax.driver.core.ConsistencyLevel;
import tsinghua.thss.sdk.core.Client;
import tsinghua.thss.sdk.core.KMXClient;
import tsinghua.thss.sdk.core.KMXConfig;
import tsinghua.thss.sdk.core.KMXConfig.Builder;

public class KmxConn {
    public static Client getClient() {
        KMXConfig config = KMXConfig.builder()
                .setClusterNodes(new String[]{"192.168.15.115"})
                .setClusterPort(9042)
                .setCoreConnectionsPerHost(3)
                .setMaxConnectionsPerHost(10)
                .setMaxRequestsPerConnection(4096)
                .setHeartbeatIntervalSeconds(0)
                .setTimeoutMillis(12000)
                .setConsistencyLevel(ConsistencyLevel.LOCAL_ONE)
                .setCacheSize(10000).setAutoBatch(false).build();

        Client client = new KMXClient(config);
        return client;
    }
}
