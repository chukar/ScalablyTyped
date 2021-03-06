package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create container versions response.
  */
@js.native
trait Schema$CreateContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[Schema$ContainerVersion] = js.native
  /**
    * Auto generated workspace path created as a result of version creation.
    * This field should only be populated if the created version was not a
    * quick preview.
    */
  var newWorkspacePath: js.UndefOr[String] = js.native
  /**
    * Whether version creation failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[Schema$SyncStatus] = js.native
}

object Schema$CreateContainerVersionResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: Schema$ContainerVersion = null,
    newWorkspacePath: String = null,
    syncStatus: Schema$SyncStatus = null
  ): Schema$CreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (newWorkspacePath != null) __obj.updateDynamic("newWorkspacePath")(newWorkspacePath.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateContainerVersionResponse]
  }
}

