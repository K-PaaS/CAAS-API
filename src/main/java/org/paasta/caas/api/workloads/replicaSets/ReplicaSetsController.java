package org.paasta.caas.api.workloads.replicaSets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Replica Set Controller 클래스
 *
 * @author CISS
 * @version 1.0
 * @since 2018.08.01
 */
@RestController
@RequestMapping("/namespaces/{namespace:.+}/replicaSets")
public class ReplicaSetsController {

    private final ReplicaSetsService replicaSetsService;

    /**
     * Instantiates a new ReplicaSets controller.
     *
     * @param replicaSetsService the replicaSet service
     */
    @Autowired
    public ReplicaSetsController(ReplicaSetsService replicaSetsService) { this.replicaSetsService = replicaSetsService;}

    /**
     * ReplicaSet 목록을 조회한다.
     *
     * @param namespace the namespace
     * @return the replicaSet list
     */
    @GetMapping
    public ReplicaSetsList getReplicaSetsList(@PathVariable("namespace") String namespace){
        return replicaSetsService.getReplicaSetsList(namespace);
    }

    /**
     * ReplicaSet 상세정보를 조회한다.
     *
     * @param namespace the namespace
     * @param replicaSetName the replicaSets name
     * @return the replicaSets
     */
    @GetMapping(value = "/{replicaSetName:.+}")
    public ReplicaSets getReplicaSets(@PathVariable("namespace") String namespace, @PathVariable("replicaSetName") String replicaSetName) {
        return replicaSetsService.getReplicaSets(namespace, replicaSetName);
    }

    /**
     * ReplicaSet YAML을 조회한다.
     *
     * @param namespace the namespace
     * @param replicaSetName the replicaSets name
     * @return the replicaSets yaml
     */
    @GetMapping(value = "/{replicaSetName:.+}/yaml")
    public ReplicaSets getReplicaSetsYaml(@PathVariable(value = "namespace") String namespace, @PathVariable(value = "replicaSetName") String replicaSetName) {
        return replicaSetsService.getReplicaSetsYaml(namespace, replicaSetName);
    }

    /**
     * ReplicaSet 객체를 label Selector를 써서 조회한다.
     * @param namespace namespace
     * @param selectors selectors
     * @return ReplicaSetsList
     */
    @GetMapping(value = "/resource/{selector:.+}")
    public ReplicaSetsList getReplicaSetsLabeSelector(@PathVariable("namespace") String namespace, @PathVariable("selector") String selectors ) {
        return replicaSetsService.getReplicaSetsListLabelSelector(namespace, selectors);
    }

}