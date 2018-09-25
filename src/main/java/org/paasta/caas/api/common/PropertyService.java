package org.paasta.caas.api.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Property Service 클래스
 *
 * @author REX
 * @version 1.0
 * @since 2018.08.07
 */
@Service
@Data
public class PropertyService {

    @Value("${caasMaster.api.url}")
    private String caasMasterApiUrl;

    @Value("${caasMaster.api.token}")
    private String caasMasterApiToken;

    @Value("${commonApi.url}")
    private String commonApiUrl;

    @Value("${caasMaster.api.list.services.list}")
    private String caasMasterApiListServicesListUrl;

    @Value("${caasMaster.api.list.services.get}")
    private String caasMasterApiListServicesGetUrl;

    @Value("${caasMaster.api.list.endpoints.list}")
    private String caasMasterApiListEndpointsListUrl;

    @Value("${caasMaster.api.list.endpoints.get}")
    private String caasMasterApiListEndpointsGetUrl;

    @Value("${caasMaster.api.list.pods.list}")
    private String caasMasterApiListPodsListUrl;

    @Value("${caasMaster.api.list.pods.get}")
    private String caasMasterApiListPodsGetUrl;

    @Value("${caasMaster.api.list.nodes.list}")
    private String caasMasterApiListNodesListUrl;

    @Value("${caasMaster.api.list.nodes.get}")
    private String caasMasterApiListNodesGetUrl;

    // ReplicaSets List
    @Value("${caasMaster.api.list.replicaSets.list}")
    private String caasMasterApiListReplicaSetsListUrl;

    // ReplicaSets
    @Value("${caasMaster.api.list.replicaSets.get}")
    private String caasMasterApiListReplicaSetsGetUrl;

    // Persistentvolumes List
    @Value("${caasMaster.api.list.persistentvolumes.list}")
    private String caasMasterApiListPersistentvolumesListUrl;

    // Persistentvolumes
    @Value("${caasMaster.api.list.persistentvolumes.get}")
    private String caasMasterApiListPersistentvolumesGetUrl;

    // horizontalpodautoscalers
    @Value("${caasMaster.api.list.horizontalpodautoscalers.get}")
    private String caasMasterApiListHorizontalpodautoscalersGetUrl;

    // events (all)
    @Value("${caasMaster.api.list.events.allList}")
    private String caasMasterApiListEventsAllListUrl;

    // events (namespace)
    @Value("${caasMaster.api.list.events.list}")
    private String caasMasterApiListEventsListUrl;

    // Role List By All Namespaces
    @Value("${caasMaster.api.list.roles.allList}")
    private String caasMasterApiListRolesAllListUrl;

    // Role List By Specified Namespace
    @Value("${caasMaster.api.list.roles.list}")
    private String caasMasterApiListRolesListUrl;

    // Get Role By Specified Namespace
    @Value("${caasMaster.api.list.roles.get}")
    private String caasMasterApiListRolesGetUrl;

    // Create Role By Specified Namespace
    @Value("${caasMaster.api.list.roles.create}")
    private String caasMasterApiListRolesCreateUrl;

    // Delete Role By Specified Namespace
    @Value("${caasMaster.api.list.roles.delete}")
    private String caasMasterApiListRolesDeleteUrl;

    @Value("${caasMaster.api.list.roles.update}")
    private String caasMasterApiListRolesUpdateUrl;

    // Deployments List for all namespaces
    @Value("${caasMaster.api.list.deployments.allList}")
    private String caasMasterApiListDeploymentsAllList;

    @Value("${caasMaster.api.list.deployments.list}")
    private String caasMasterApiListDeploymentsList;

    @Value("${caasMaster.api.list.deployments.get}")
    private String caasMasterApiListDeploymentsGet;

    // RoleBinding List By All Namespaces
    @Value("${caasMaster.api.list.roleBindings.allList}")
    private String caasMasterApiListRoleBindingsAllListUrl;

    // RoleBinding List By Specified Namespace
    @Value("${caasMaster.api.list.roleBindings.list}")
    private String caasMasterApiListRoleBindingsListUrl;

    // RoleBinding By Specified Namespace
    @Value("${caasMaster.api.list.roleBindings.get}")
    private String caasMasterApiListRoleBindingsGetUrl;

    // RoleBinding allocate
    @Value("${caasMaster.api.list.roleBindings.create}")
    private String caasMasterApiListRoleBindingsCreateUrl;

    // RoleBinding cancel
    @Value("${caasMaster.api.list.roleBindings.delete}")
    private String caasMasterApiListRoleBindingsDeleteUrl;

    @Value("${caasMaster.api.list.roleBindings.update}")
    private String caasMasterApiListRoleBindingsUpdateUrl;

    @Value("${caasMaster.api.list.users.get}")
    private String caasMasterApiListUsersGetUrl;

    @Value("${caasMaster.api.list.users.create}")
    private String caasMasterApiListUsersCreateUrl;

    @Value("${caasMaster.api.list.users.delete}")
    private String caasMasterApiListUsersDeleteUrl;

    // Namespaces
    @Value("${caasMaster.api.list.namespaces.get}")
    private String caasMasterApiListNamespaceGetUrl;

    // Namespaces
    @Value("${caasMaster.api.list.resourceQuotas.list}")
    private String caasMasterApiListResourceQuotasListUrl;

    @Value("${caasMaster.api.list.secrets.get}")
    private String caasMasterApiListSecretsGetUrl;
}
