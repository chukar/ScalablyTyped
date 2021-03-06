package typings.atPulumiKubernetes.typesOutputMod.scheduling.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityClassList is a collection of priority classes.
  */
trait PriorityClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: schedulingDotk8sDotioSlashv1
  /**
    * items is the list of PriorityClasses
    */
  val items: js.Array[PriorityClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object PriorityClassList {
  @scala.inline
  def apply(
    apiVersion: schedulingDotk8sDotioSlashv1,
    items: js.Array[PriorityClass],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList,
    metadata: ListMeta
  ): PriorityClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PriorityClassList]
  }
}

