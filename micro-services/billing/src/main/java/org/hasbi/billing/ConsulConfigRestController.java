package org.hasbi.billing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulConfigRestController {
    @Autowired
    private ConsulConfig consulConfig;
    @Autowired
    private VaultConfig vaultConfig;

    @GetMapping(path = "/config")
    public Map<String, Object> config(){
        return Map.of("consulConfig", consulConfig, "vaultConfig", vaultConfig);
    }
}
