package typings.atPulumiKubernetes.typesOutputMod.core.v1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
  */
trait ComponentStatus extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
  /**
    * List of component conditions observed
    */
  val conditions: js.Array[ComponentCondition]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ComponentStatus
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
}

object ComponentStatus {
  @scala.inline
  def apply(
    apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1,
    conditions: js.Array[ComponentCondition],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ComponentStatus,
    metadata: ObjectMeta
  ): ComponentStatus = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentStatus]
  }
}

