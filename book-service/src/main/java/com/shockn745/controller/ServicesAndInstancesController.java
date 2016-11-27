package com.shockn745.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kempenich Florian
 */
@RestController
public class ServicesAndInstancesController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    LoadBalancerClient loadBalancerClient;


    @RequestMapping(value = "services")
    public Services displayServicesInstances() {
        return new Services(
                discoveryClient.getServices()
        );
    }

    @RequestMapping(value = "instances/{serviceName}")
    public List<ServiceInstance> displayInstanceForService(@PathVariable String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }

    @RequestMapping(value = "loadbalancer/{serviceName}")
    public ServiceInstance loadBalancer(@PathVariable String serviceName) {
        return loadBalancerClient.choose(serviceName);
    }


    private static class Services {
        public final List<String> services;

        public Services(List<String> services) {
            this.services = services;
        }
    }
}
