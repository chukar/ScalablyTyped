package typings.atPulumiKubernetes.typesOutputMod.rbac.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleList is a collection of Roles Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 RoleList, and will no longer be served in v1.20.
  */
trait RoleList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1
  /**
    * Items is a list of Roles
    */
  val items: js.Array[Role]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object RoleList {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1,
    items: js.Array[Role],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleList,
    metadata: ListMeta
  ): RoleList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleList]
  }
}

