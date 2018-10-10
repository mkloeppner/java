/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1HostAlias;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1PodDNSConfig;
import io.kubernetes.client.models.V1PodReadinessGate;
import io.kubernetes.client.models.V1PodSecurityContext;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PodSpec is a description of a pod.
 */
@ApiModel(description = "PodSpec is a description of a pod.")

public class V1PodSpec {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("affinity")
  private V1Affinity affinity = null;

  @SerializedName("automountServiceAccountToken")
  private Boolean automountServiceAccountToken = null;

  @SerializedName("containers")
  private List<V1Container> containers = new ArrayList<V1Container>();

  @SerializedName("dnsConfig")
  private V1PodDNSConfig dnsConfig = null;

  @SerializedName("dnsPolicy")
  private String dnsPolicy = null;

  @SerializedName("hostAliases")
  private List<V1HostAlias> hostAliases = null;

  @SerializedName("hostIPC")
  private Boolean hostIPC = null;

  @SerializedName("hostNetwork")
  private Boolean hostNetwork = null;

  @SerializedName("hostPID")
  private Boolean hostPID = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("imagePullSecrets")
  private List<V1LocalObjectReference> imagePullSecrets = null;

  @SerializedName("initContainers")
  private List<V1Container> initContainers = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("priorityClassName")
  private String priorityClassName = null;

  @SerializedName("readinessGates")
  private List<V1PodReadinessGate> readinessGates = null;

  @SerializedName("restartPolicy")
  private String restartPolicy = null;

  @SerializedName("schedulerName")
  private String schedulerName = null;

  @SerializedName("securityContext")
  private V1PodSecurityContext securityContext = null;

  @SerializedName("serviceAccount")
  private String serviceAccount = null;

  @SerializedName("serviceAccountName")
  private String serviceAccountName = null;

  @SerializedName("shareProcessNamespace")
  private Boolean shareProcessNamespace = null;

  @SerializedName("subdomain")
  private String subdomain = null;

  @SerializedName("terminationGracePeriodSeconds")
  private Long terminationGracePeriodSeconds = null;

  @SerializedName("tolerations")
  private List<V1Toleration> tolerations = null;

  @SerializedName("volumes")
  private List<V1Volume> volumes = null;

  public V1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(value = "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1PodSpec affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * If specified, the pod&#39;s scheduling constraints
   * @return affinity
  **/
  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public V1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  public Boolean isAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public V1PodSpec containers(List<V1Container> containers) {
    this.containers = containers;
    return this;
  }

  public V1PodSpec addContainersItem(V1Container containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  public List<V1Container> getContainers() {
    return containers;
  }

  public void setContainers(List<V1Container> containers) {
    this.containers = containers;
  }

  public V1PodSpec dnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

   /**
   * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
   * @return dnsConfig
  **/
  @ApiModelProperty(value = "Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
  public V1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }

  public void setDnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }

  public V1PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

   /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @ApiModelProperty(value = "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public V1PodSpec hostAliases(List<V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
    return this;
  }

  public V1PodSpec addHostAliasesItem(V1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<V1HostAlias>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified. This is only valid for non-hostNetwork pods.
   * @return hostAliases
  **/
  @ApiModelProperty(value = "HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
  public List<V1HostAlias> getHostAliases() {
    return hostAliases;
  }

  public void setHostAliases(List<V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }

  public V1PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   * @return hostIPC
  **/
  @ApiModelProperty(value = "Use the host's ipc namespace. Optional: Default to false.")
  public Boolean isHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public V1PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   * @return hostNetwork
  **/
  @ApiModelProperty(value = "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public V1PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

   /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   * @return hostPID
  **/
  @ApiModelProperty(value = "Use the host's pid namespace. Optional: Default to false.")
  public Boolean isHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public V1PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   * @return hostname
  **/
  @ApiModelProperty(value = "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1PodSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1PodSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1PodSpec initContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public V1PodSpec addInitContainersItem(V1Container initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<V1Container>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   * @return initContainers
  **/
  @ApiModelProperty(value = "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  public List<V1Container> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
  }

  public V1PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   * @return nodeName
  **/
  @ApiModelProperty(value = "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1PodSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1PodSpec priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public V1PodSpec priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * If specified, indicates the pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
   * @return priorityClassName
  **/
  @ApiModelProperty(value = "If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  public V1PodSpec readinessGates(List<V1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
    return this;
  }

  public V1PodSpec addReadinessGatesItem(V1PodReadinessGate readinessGatesItem) {
    if (this.readinessGates == null) {
      this.readinessGates = new ArrayList<V1PodReadinessGate>();
    }
    this.readinessGates.add(readinessGatesItem);
    return this;
  }

   /**
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \&quot;True\&quot; More info: https://github.com/kubernetes/community/blob/master/keps/sig-network/0007-pod-ready%2B%2B.md
   * @return readinessGates
  **/
  @ApiModelProperty(value = "If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://github.com/kubernetes/community/blob/master/keps/sig-network/0007-pod-ready%2B%2B.md")
  public List<V1PodReadinessGate> getReadinessGates() {
    return readinessGates;
  }

  public void setReadinessGates(List<V1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
  }

  public V1PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   * @return restartPolicy
  **/
  @ApiModelProperty(value = "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public V1PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public V1PodSpec securityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
   * @return securityContext
  **/
  @ApiModelProperty(value = "SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public V1PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   * @return serviceAccount
  **/
  @ApiModelProperty(value = "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public V1PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   * @return serviceAccountName
  **/
  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public V1PodSpec shareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
    return this;
  }

   /**
   * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. This field is alpha-level and is honored only by servers that enable the PodShareProcessNamespace feature.
   * @return shareProcessNamespace
  **/
  @ApiModelProperty(value = "Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. This field is alpha-level and is honored only by servers that enable the PodShareProcessNamespace feature.")
  public Boolean isShareProcessNamespace() {
    return shareProcessNamespace;
  }

  public void setShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
  }

  public V1PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

   /**
   * If specified, the fully qualified Pod hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   * @return subdomain
  **/
  @ApiModelProperty(value = "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public V1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   * @return terminationGracePeriodSeconds
  **/
  @ApiModelProperty(value = "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public V1PodSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1PodSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public V1PodSpec volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public V1PodSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   * @return volumes
  **/
  @ApiModelProperty(value = "List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodSpec v1PodSpec = (V1PodSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1PodSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, v1PodSpec.affinity) &&
        Objects.equals(this.automountServiceAccountToken, v1PodSpec.automountServiceAccountToken) &&
        Objects.equals(this.containers, v1PodSpec.containers) &&
        Objects.equals(this.dnsConfig, v1PodSpec.dnsConfig) &&
        Objects.equals(this.dnsPolicy, v1PodSpec.dnsPolicy) &&
        Objects.equals(this.hostAliases, v1PodSpec.hostAliases) &&
        Objects.equals(this.hostIPC, v1PodSpec.hostIPC) &&
        Objects.equals(this.hostNetwork, v1PodSpec.hostNetwork) &&
        Objects.equals(this.hostPID, v1PodSpec.hostPID) &&
        Objects.equals(this.hostname, v1PodSpec.hostname) &&
        Objects.equals(this.imagePullSecrets, v1PodSpec.imagePullSecrets) &&
        Objects.equals(this.initContainers, v1PodSpec.initContainers) &&
        Objects.equals(this.nodeName, v1PodSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1PodSpec.nodeSelector) &&
        Objects.equals(this.priority, v1PodSpec.priority) &&
        Objects.equals(this.priorityClassName, v1PodSpec.priorityClassName) &&
        Objects.equals(this.readinessGates, v1PodSpec.readinessGates) &&
        Objects.equals(this.restartPolicy, v1PodSpec.restartPolicy) &&
        Objects.equals(this.schedulerName, v1PodSpec.schedulerName) &&
        Objects.equals(this.securityContext, v1PodSpec.securityContext) &&
        Objects.equals(this.serviceAccount, v1PodSpec.serviceAccount) &&
        Objects.equals(this.serviceAccountName, v1PodSpec.serviceAccountName) &&
        Objects.equals(this.shareProcessNamespace, v1PodSpec.shareProcessNamespace) &&
        Objects.equals(this.subdomain, v1PodSpec.subdomain) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1PodSpec.terminationGracePeriodSeconds) &&
        Objects.equals(this.tolerations, v1PodSpec.tolerations) &&
        Objects.equals(this.volumes, v1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsConfig, dnsPolicy, hostAliases, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, priority, priorityClassName, readinessGates, restartPolicy, schedulerName, securityContext, serviceAccount, serviceAccountName, shareProcessNamespace, subdomain, terminationGracePeriodSeconds, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    readinessGates: ").append(toIndentedString(readinessGates)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    shareProcessNamespace: ").append(toIndentedString(shareProcessNamespace)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

