package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `DeleteInstance`.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest extends js.Object {
  /**
    * Name of the instance to delete. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest {
  @scala.inline
  def apply(name: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest]
  }
}

